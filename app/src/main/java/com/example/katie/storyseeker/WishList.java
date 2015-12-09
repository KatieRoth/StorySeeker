package com.example.katie.storyseeker;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;


//////////http://stackoverflow.com/questions/31227404/set-long-click-listener-for-listview
///// this is not going to work for what I got. I tried this type on thing on my branch
////// KatieList2 but I could not get that working either




public class WishList extends ListActivity{


    List<String> books = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        books.add("Work dammit");
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list, R.id.Itemname, books));
        ListView lv = getListView();
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> av, View v, int pos, long id) {
                Toast.makeText(WishList.this, "LongClick", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }


   /* public boolean onItemLongClick(AdapterView<?> l, View v,
                                   final int position, long id) {

        Toast.makeText(this, "long clicked pos: " + position, Toast.LENGTH_LONG).show();

        return true;
    }
    */

    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        if (l.getItemAtPosition(position).toString()== "There Was a Cold Lady Who Swallowed Some Snow!") {
            Intent intent = new Intent(this, ColdLadyBook.class);
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Winter Is") {
            Intent intent = new Intent(this, WinterIsBook.class);
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Making a Friend") {
            Intent intent = new Intent(this, MakingAFriend.class);
            startActivity(intent);
        }
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
}
