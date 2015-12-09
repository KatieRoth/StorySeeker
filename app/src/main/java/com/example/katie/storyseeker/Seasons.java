package com.example.katie.storyseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Seasons extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_seasons, menu);
        return true;
    }
    public void winter(View view){

        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        Intent intent = new Intent(Seasons.this, Winter.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", 1);
        startActivity(intent);

    }
    public void spring(View view){

        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        Intent intent = new Intent(Seasons.this, Spring.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", 3);
        startActivity(intent);
    }

    public void summer(View view){
        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        Intent intent = new Intent(Seasons.this, Summer.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", 2);
        startActivity(intent);
    }
    public void fall(View view){
        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        Intent intent = new Intent(Seasons.this, Fall.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", 4);
        startActivity(intent);
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
    public void home(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }
}
