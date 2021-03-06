package com.example.katie.storyseeker;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

//Rachel Davis
//First quiz question
public class QuizStart extends AppCompatActivity {

    //Globals var = (Globals)getApplicationContext();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_start, menu);
        return true;
    }

    public void seasons(View view){


        Intent intent = new Intent(QuizStart.this, Seasons.class);
        intent.putExtra("questionOne", 1);
        startActivity(intent);
        //Intent intent1 = new Intent(getApplicationContext(),SelectedBooks.class);
        //Bundle bundle = new Bundle();
        //Globals g = (Globals)getApplication();
        //g.setQuestionOne(1);
        //startActivity(new Intent(this, Seasons.class));
        //Globals var = (Globals)getApplicationContext();
        //var.setQuestionOne(1);
        //Intent intent = new Intent(this, Seasons.class);
        //startActivity(intent);
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

    //Rachel Davis
    //button to take you to home
    public void home(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }
}
