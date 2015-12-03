package com.example.katie.storyseeker;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SelectedBooks extends ListActivity {

    String[] books ={
            "There Was a Cold Lady Who Swallowed Some Snow!",
            "Winter Is",
            "Making a Friend"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_books);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.list,
                R.id.Itemname, books));
    }

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
