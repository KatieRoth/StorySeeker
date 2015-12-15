package com.example.katie.storyseeker;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//////////http://stackoverflow.com/questions/31227404/set-long-click-listener-for-listview
///// this is not going to work for what I got. I tried this type on thing on my branch
////// KatieList2 but I could not get that working either




public class WishList extends ListActivity{


    private ArrayList<String> bookList = new ArrayList<>();
    private SQLiteDatabase db;
    private static String DB_PATH="/data/data/com.example.katie.storyseeker/databases";
    private static final String DB_NAME = "StorySeekerBooks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list);

        try {
            copyDataBase();
        } catch (IOException se) {

        }
        displayAllEntries();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selected_books, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void copyDataBase() throws IOException{
        InputStream myInput = getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer))>0) {myOutput.write(buffer,0,length);
        }

        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void displayAllEntries() {
        try {
            String myPath = DB_PATH + DB_NAME;
            SQLiteDatabase db = SQLiteDatabase.openDatabase(myPath, null,
                    SQLiteDatabase.OPEN_READONLY);

            String selectQuery = "SELECT TITLE, AUTHOR, COVER FROM wishList";
            Cursor cursor = db.rawQuery(selectQuery, null);

            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        String title = cursor.getString(cursor.getColumnIndex("TITLE"));
                        String author = cursor.getString(cursor.getColumnIndex("AUTHOR"));
                        String cover = cursor.getString(cursor.getColumnIndex("COVER"));
                        bookList.add("Title: " + title + "\n" + "Author: " + author);
                    } while (cursor.moveToNext());
                }
            }
        }catch(SQLiteException se){
            Log.e(getClass().getSimpleName(), "Could not open the database");
        }finally{
            if (db != null)
                db.close();
        }

        TextView tView = new TextView(this);
        tView.setText("Your Wishlist");
        getListView().addHeaderView(tView);

        setListAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, bookList));
        getListView().setTextFilterEnabled(true);

    }

    public void home(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }



}
