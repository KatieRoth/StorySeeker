package com.example.katie.storyseeker;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
>>>>>>> 89e635218c8d4453e0041a71791a06fe27c63b1a
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


//Seasons, Winter, Activities
public class StartScreen extends AppCompatActivity {

    public void quiz(View view){
        Intent intent = new Intent(this, QuizStart.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        DataBaseHelper myDbHelper = new DataBaseHelper(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_screen, menu);
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
