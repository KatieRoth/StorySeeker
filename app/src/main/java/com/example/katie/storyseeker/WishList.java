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
        GlobalList g = (GlobalList)getApplication();
        boolean heraldBool=g.getHerald();
        boolean giraffeBool = g.getGirffe();


        text = (TextView) findViewById(R.id.mainText);
        listValues = new ArrayList<String>();
        if(!bundle.isEmpty()) {
            Boolean herald = bundle.getBoolean("herald");


            if (herald == true) {
                heraldBool = true;

            }

            Boolean giraffe = bundle.getBoolean("giraffe");

            if (giraffe == true) {
                giraffeBool = true;

            }
        }
        if (heraldBool == true) {
            listValues.add("Herald and the purple crayon");
        }
        if (giraffeBool == true) {
            listValues.add("Giraffes cant dance");
        }

        listValues.add("Good Night Moon");
        listValues.add("the Hungry Hungry Caterpillar");
        listValues.add("The Jewel Heart");


        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this, R.layout.list,R.id.listText, listValues);
        setListAdapter(myAdapter);

    }


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