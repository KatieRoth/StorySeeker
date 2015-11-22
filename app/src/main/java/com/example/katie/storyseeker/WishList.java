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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WishList extends ListActivity {

    private TextView text;
    private List<String> listValues;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list);

       Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        GlobalVariables g = (GlobalVariables)getApplication();
        boolean book_one_bool=g.getBook1();
        boolean book_two_bool = g.getBook2();
        boolean book_three_bool = g.getBook3();


        text = (TextView) findViewById(R.id.mainText);
        listValues = new ArrayList<String>();
        /*
        if(!bundle.isEmpty()) {
            Boolean bookOne = bundle.getBoolean("book1");

            if (bookOne == true) {
                book_one_bool = true;

            }

            Boolean bookTwo = bundle.getBoolean("book_two");

            if (bookTwo == true) {
                book_two_bool = true;

            }

            Boolean bookThree = bundle.getBoolean("book_two");

            if (bookThree == true) {
                book_three_bool = true;

            }
        }

        if (book_one_bool == true) {
            listValues.add("Herald and the Purple Crayon");
        }
        if (book_two_bool == true) {
            listValues.add("Giraffes Can't Dance");
        }
        if (book_three_bool == true) {
            listValues.add("The Giving Tree");
        }
        */
            listValues.add("Good Night Moon");
            listValues.add("the Hungry Hungry Caterpillar");
            listValues.add("The Jewel Heart");


            ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this, R.layout.row_layout,R.id.listText, listValues);
            setListAdapter(myAdapter);

        }

       /* protected void onListItemClick(ListView l, View v, int position, long id)
        {
            super.onListItemClick(l,v,position,id);
            if (l.getItemAtPosition(position).toString()== "Haiku Deathmatch        Fri. 10 pm") {
                Intent intent = new Intent(this, removeEvent_Activity.class);
                startActivity(intent);
            }
            if (l.getItemAtPosition(position).toString()== "Team Trivia             Sat. 8 pm") {
                Intent intent = new Intent(this, Remove_TriviaActivity.class);
                startActivity(intent);
            }

        }
        */

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_wish_list, menu);
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
