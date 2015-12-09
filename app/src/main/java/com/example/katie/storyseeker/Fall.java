package com.example.katie.storyseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Fall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fall, menu);
        return true;
    }

    public void activities (View view){
        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        int value2 = bundle.getInt("questionTwo");
        Intent intent = new Intent(Fall.this, SelectedBooks.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", value2);
        intent.putExtra("questionThree", 2);
        startActivity(intent);

    }

    public void holidays (View view){
        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("questionOne");
        int value2 = bundle.getInt("questionTwo");
        Intent intent = new Intent(Fall.this, SelectedBooks.class);
        intent.putExtra("questionOne", value);
        intent.putExtra("questionTwo", value2);
        intent.putExtra("questionThree", 1);
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
}
