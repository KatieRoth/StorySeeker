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

    String[] winterHolidayBooks = {
            "How The Grinch Stole Christmas",
            "The Polar Express",
            "Happy Valentine's Day, Mouse!"
    };

    String[] winterActivityBooks ={
            "There Was a Cold Lady Who Swallowed Some Snow!",
            "Winter Is",
            "Making a Friend"
    };

    String[] summerHolidayBooks = {
            "Fourth of July Mice",
            "Froggy's Day with Dad",
            "A Flag for All"
    };

    String[] summerActivityBooks ={
            "The Night Before Summer Camp",
            "Beach Day!",
            "Fun Dog, Sun Dog"
    };

    String[] fallHolidayBooks = {
            "Duck & Goose, Find a Pumpkin",
            "Milly and the Macy's Parade",
            "The Hallo-Wiener"
    };

    String[] fallActivityBooks ={
            "Who Loves the Fall?",
            "Let It Fall",
            "Autumn Is for Apples"
    };

    String[] springHolidayBooks = {
            "The Dumb Bunnies Easter",
            "April Fool!",
            "Fancy Nancy's Marvelous Mother's Day Brunch"
    };

    String[] springActivityBooks ={
            "And Then It's Spring",
            "Let It Rain",
            "Hurray for Spring!"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_books);

        Bundle bundle = getIntent().getExtras();
        int value1 = bundle.getInt("questionOne");
        int value2 = bundle.getInt("questionTwo");
        int value3 = bundle.getInt("questionThree");

        if(value1 == 1 && value2 == 1 && value3==2){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, winterActivityBooks));
        }

        if(value1 == 1 && value2 == 1 && value3==1){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, winterHolidayBooks));
        }
        if(value1 == 1 && value2 == 2 && value3==2){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, summerActivityBooks));
        }

        if(value1 == 1 && value2 == 2 && value3==1){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, summerHolidayBooks));
        }
        if(value1 == 1 && value2 == 1 && value3==2){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, winterActivityBooks));
        }

        if(value1 == 1 && value2 == 1 && value3==1){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, winterHolidayBooks));
        }
        if(value1 == 1 && value2 == 3 && value3==2){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, springActivityBooks));
        }

        if(value1 == 1 && value2 == 3 && value3==1){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, springHolidayBooks));
        }
        if(value1 == 1 && value2 == 4 && value3==2){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, fallActivityBooks));
        }

        if(value1 == 1 && value2 == 4 && value3==1){
            this.setListAdapter(new ArrayAdapter<String>(
                    this, R.layout.list,
                    R.id.Itemname, fallHolidayBooks));
        }




    }
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        if (l.getItemAtPosition(position).toString()== "There Was a Cold Lady Who Swallowed Some Snow!") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "ColdLady");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Winter Is") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "WinterIs");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Making a Friend") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "MakingAFriend");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "How The Grinch Stole Christmas") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Grinch");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "The Polar Express") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "PolarExpress");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Happy Valentine's Day, Mouse!") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Valentines");
            startActivity(intent);
        }

        if (l.getItemAtPosition(position).toString()== "Fourth of July Mice") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "FourthOfJuly");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Froggy's Day with Dad") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Froggy");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "A Flag for All") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Flag");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "The Night Before Summer Camp") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "SummerCamp");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Beach Day!") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Beach");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Fun Dog, Sun Dog") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "FunDog");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Duck & Goose, Find a Pumpkin") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Pumpkin");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Milly and the Macy's Parade") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Parade");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "The Hallo-Wiener") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Wiener");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Who Loves the Fall?") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "LovesFall");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Let It Fall") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "LetItFall");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Autumn Is for Apples") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Apples");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "The Dumb Bunnies Easter") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Bunnies");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "April Fool!") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "AprilFool");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Fancy Nancy's Marvelous Mother's Day Brunch") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Brunch");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "And Then It's Spring") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Spring");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Let It Rain") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Rain");
            startActivity(intent);
        }
        if (l.getItemAtPosition(position).toString()== "Hurray for Spring!") {
            Intent intent = new Intent(this, BookDescription.class);
            intent.putExtra("book", "Hurray");
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