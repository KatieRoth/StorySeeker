package com.example.katie.storyseeker;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

//Katie Roth

public class SelectedBooks extends Activity {
    ListView list;

    String[] winterHolidayBooks = {
            "How The Grinch Stole Christmas",
            "The Polar Express",
            "Happy Valentine's Day, Mouse!"
    };

    Integer[] winterHolidayImages = {
            R.drawable.grinchstolechristmas,
            R.drawable.polarexpress,
            R.drawable.valentinesdaymouse
    };

    String[] winterActivityBooks ={
            "There Was a Cold Lady Who Swallowed Some Snow!",
            "Winter Is",
            "Making a Friend"
    };

    Integer[] winterActivityImages = {
            R.drawable.acoldlady,
            R.drawable.winteris,
            R.drawable.makingfriend
    };


    String[] summerHolidayBooks = {
            "Fourth of July Mice",
            "Froggy's Day with Dad",
            "A Flag for All"
    };

    Integer[] summerHolidayImages = {
            R.drawable.mice,
            R.drawable.froggysdaywithdad,
            R.drawable.flagforall
    };

    String[] summerActivityBooks ={
            "The Night Before Summer Camp",
            "Beach Day!",
            "Fun Dog, Sun Dog"
    };

    Integer[] summerActivityImages = {
            R.drawable.camp,
            R.drawable.beach,
            R.drawable.fundog
    };

    String[] fallHolidayBooks = {
            "Duck & Goose, Find a Pumpkin",
            "Milly and the Macy's Parade",
            "The Hallo-Wiener"
    };

    Integer[] fallHolidayImages = {
            R.drawable.duckandgoose,
            R.drawable.milly,
            R.drawable.thehallowiener
    };



    String[] fallActivityBooks ={
            "Who Loves the Fall?",
            "Let It Fall",
            "Autumn Is for Apples"
    };

    Integer[] fallActivityImages = {
            R.drawable.lovefall,
            R.drawable.letitfall,
            R.drawable.apples
    };

    String[] springHolidayBooks = {
            "The Dumb Bunnies Easter",
            "April Fool!",
            "Fancy Nancy's Marvelous Mother's Day Brunch"
    };

    Integer[] springHolidayImages = {
            R.drawable.bunnieseaster,
            R.drawable.aprilfool,
            R.drawable.fancynancy
    };

    String[] springActivityBooks ={
            "And Then It's Spring",
            "Let It Rain",
            "Hurray for Spring!"
    };

    Integer[] springActivityImages = {
            R.drawable.itsspring,
            R.drawable.rain,
            R.drawable.hurrayspring
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_books);

        //Katie Roth
        //Populate the list of book after the quiz based on the buttons click
        //the button clicked information is passed through bundles

        Bundle bundle = getIntent().getExtras();
        int value1 = bundle.getInt("questionOne");
        int value2 = bundle.getInt("questionTwo");
        int value3 = bundle.getInt("questionThree");

        //winter activity books
        if(value1 == 1 && value2 == 1 && value3==2){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, winterActivityBooks, winterActivityImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (winterActivityBooks[+position].toString() == "There Was a Cold Lady Who Swallowed Some Snow!") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "ColdLady");
                        startActivity(intent);
                    }
                    if (winterActivityBooks[+position].toString() == "Winter Is") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "WinterIs");
                        startActivity(intent);
                    }
                    if (winterActivityBooks[+position].toString() == "Making a Friend") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "MakingAFriend");
                        startActivity(intent);
                    }
                }
            });

        }

        //winter holiday books
        else if(value1 == 1 && value2 == 1 && value3==1){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, winterHolidayBooks, winterHolidayImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (winterHolidayBooks[+position].toString() == "How The Grinch Stole Christmas") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Grinch");
                        startActivity(intent);
                    }
                    if (winterHolidayBooks[+position].toString() == "The Polar Express") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "PolarExpress");
                        startActivity(intent);
                    }
                    if (winterHolidayBooks[+position].toString() == "Happy Valentine's Day, Mouse!") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Valentines");
                        startActivity(intent);
                    }
                }
            });

        }

        //summer activity books
        else if(value1 == 1 && value2 == 2 && value3==2){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, summerActivityBooks, summerActivityImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (summerActivityBooks[+position].toString()== "Beach Day!") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Beach");
                        startActivity(intent);
                    }
                    if (summerActivityBooks[+position].toString()== "Fun Dog, Sun Dog") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "FunDog");
                        startActivity(intent);
                    }
                    if (summerActivityBooks[+position].toString()== "The Night Before Summer Camp") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "SummerCamp");
                        startActivity(intent);
                    }
                }
            });
        }

        //summer holiday books
        else if(value1 == 1 && value2 == 2 && value3==1){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, summerHolidayBooks, summerHolidayImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (summerHolidayBooks[+position].toString()== "Fourth of July Mice") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "FourthOfJuly");
                        startActivity(intent);
                    }
                    if (summerHolidayBooks[+position].toString()== "Froggy's Day with Dad") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book","Froggy");
                        startActivity(intent);
                    }
                    if (summerHolidayBooks[+position].toString()== "A Flag for All") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Flag");
                        startActivity(intent);
                    }
                }
            });


        }

        //spring activity books
        else if(value1 == 1 && value2 == 3 && value3==2){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, springActivityBooks, springActivityImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (springActivityBooks[+position].toString()== "And Then It's Spring") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Spring");
                        startActivity(intent);
                    }
                    if (springActivityBooks[+position].toString()== "Let It Rain") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book","Rain");
                        startActivity(intent);
                    }
                    if (springActivityBooks[+position].toString()== "Hurray for Spring!") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Hurray");
                        startActivity(intent);
                    }
                }
            });

        }

        //spring holiday books
        else if(value1 == 1 && value2 == 3 && value3==1){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, springHolidayBooks, springHolidayImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (springHolidayBooks[+position].toString()== "The Dumb Bunnies Easter") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Bunnies");
                        startActivity(intent);
                    }
                    if (springHolidayBooks[+position].toString()== "April Fool!") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book","AprilFool");
                        startActivity(intent);
                    }
                    if (springHolidayBooks[+position].toString()== "Fancy Nancy's Marvelous Mother's Day Brunch") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Brunch");
                        startActivity(intent);
                    }
                }
            });


        }
        //fall activity books
        else if(value1 == 1 && value2 == 4 && value3==2){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, fallActivityBooks, fallActivityImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (fallActivityBooks[+position].toString()== "Who Loves the Fall?") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "LovesFall");
                        startActivity(intent);
                    }
                    if (fallActivityBooks[+position].toString()== "Let It Fall") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "LetItFall");
                        startActivity(intent);
                    }
                    if (fallActivityBooks[+position].toString()== "Autumn Is for Apples") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Apples");
                        startActivity(intent);
                    }

                }
            });
        }

        //fall holiday books
        else if(value1 == 1 && value2 == 4 && value3==1){

            CustomList adapter = new
                    CustomList(SelectedBooks.this, fallHolidayBooks, fallHolidayImages);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    if (fallHolidayBooks[+position].toString()== "Duck & Goose, Find a Pumpkin") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Pumpkin");
                        startActivity(intent);
                    }
                    if (fallHolidayBooks[+position].toString()== "Milly and the Macy's Parade") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book","Parade");
                        startActivity(intent);
                    }
                    if (fallHolidayBooks[+position].toString()== "The Hallo-Wiener") {
                        Intent intent = new Intent(SelectedBooks.this, BookDescription.class);
                        intent.putExtra("book", "Wiener");
                        startActivity(intent);
                    }
                }
            });


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

    public void home(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }
}