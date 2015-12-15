package com.example.katie.storyseeker;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BookDescription extends AppCompatActivity {

    public String bookName;

    private static final String TABLE_NAME= "wishList";
    private static final String TITLE = "TITLE";
    private static final String AUTHOR = "AUTHOR";
    private static final String COVER = "COVER";
    public String buyLink = null;
    public String authorString = "yes";
    public String bookCoverString = "yes";
    public String titleString = "yes";
    private static String DB_PATH="/data/data/com.example.katie.storyseeker/databases";
    private static final String DB_NAME = "StorySeekerBooks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description);

        try {
            copyDataBase();
        } catch (IOException se) {

        }

        Bundle bundle = getIntent().getExtras();
        bookName = bundle.getString("book");



        final ImageButton addToWishList = (ImageButton) findViewById(R.id.addToWishList);
        final TextView textOne = (TextView) findViewById(R.id.textView2);
        final ImageView image = (ImageView) findViewById(R.id.imageView2);
        final TextView title = (TextView) findViewById(R.id.textView);
        final TextView author = (TextView) findViewById(R.id.textView1);
        final ImageButton toHome = (ImageButton) findViewById(R.id.homeButton);
        final ImageButton buyNow = (ImageButton) findViewById(R.id.buyNow);

        buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buyNow(v);
            }
        });

        addToWishList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToWishList(authorString, titleString, bookCoverString);
                toWishList(v);
            }
        });
        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHome(v);
            }
        });
        if (bookName.equals("ColdLady")) {
            //"There Was a Cold Lady Who Swallowed Some Snow!"
            title.setText("There Was a Cold Lady Who Swallowed Some Snow!");
            author.setText("Lucille Colandro");

            textOne.setText("A snowy take on the traditional " +
                    "'There Was an Old Lady Who Swalloed A Fly,' " +
                    "Lucille Colandro uses rhymes and beautiful " +
                    "illustrations to depict winter wonderland. " +
                    "Perfect for kindergarten to second graders, " +
                    "readers can guess along as the old lady " +
                    "swallows everything from a hat to coal. " +
                    "The lively ad hilarious book will keep " +
                    "children on their toes with a surprise " +
                    "ending that will leave them begging for more.");
            buyLink = "http://www.amazon.com/gp/aw/d/0439567033/ref=mp_s_a_1_1?qid=1450093195&sr=8-1&pi=SY200_QL40&keywords=there+was+a+cold+lady+who+swallowed+some+snow&dpPl=1&dpID=61hCxbemKZL&ref=plSrch\n";
            titleString = "There Was a Cold Lady Who Swallowed Some Snow!";
            authorString = "Lucille Colandro";
            bookCoverString = "acoldlady";

            image.setBackgroundResource(R.drawable.acoldlady);


        }
        else if (bookName.equals("WinterIs")) {
            //Winter is
            title.setText("Winter Is");
            author.setText("Ann Dixon");

            textOne.setText("From sledding to skating and " +
                    "hot cocoa to gingerbread, winter is " +
                    "so many things. Inside Ann Dixon's " +
                    "seasonal book, readers will explore all " +
                    "that winter has to offer. Illustrated " +
                    "in water color, Dixon's celebration of " +
                    "Winter is perfect for tuck-in time.");

            buyLink ="http://www.amazon.com/gp/aw/d/0882405438/ref=mp_s_a_1_1?qid=1450094068&sr=8-1&keywords=Winter+is+Ann&pi=SY200_QL40&dpPl=1&dpID=514HTVGMKVL&ref=plSrch";
            titleString = "Winter Is";
            authorString = "Ann Dixon";
            bookCoverString = "winteris";
            image.setBackgroundResource(R.drawable.winteris);

        }
        else if (bookName.equals("MakingAFriend")){
            //Making a Friend
            title.setText("Making a Friend");
            author.setText("Alison McGhee");

            textOne.setText("Winter is more than cool temperatures," +
                    " but the joys of making lasting friendships. " +
                    "When the snow hits the ground, the first thing " +
                    "most do is build a snowman. But what happens when " +
                    "the snow melts? Read more to see how this young " +
                    "boy stays connected to his snowy pal forever. " +
                    "Winter is more than cool temperatures, but the " +
                    "joys of making lasting friendships. When the " +
                    "snow hits the ground, the first thing most do " +
                    "is build a snowman. But what happens when the " +
                    "snow melts? Read more to see how this young boy " +
                    "stays connected to his snowy pal forever.");
            buyLink = "http://www.amazon.com/gp/aw/d/1416989986/ref=mp_s_a_1_1?qid=1450093228&sr=8-1&pi=SY200_QL40&keywords=making+a+friend&dpPl=1&dpID=51YGEJ4193L&ref=plSrch";
            titleString = "TMaking a Friend";
            authorString = "Alison McGhee";
            bookCoverString = "makingfriend";
            image.setBackgroundResource(R.drawable.makingfriend);

        }
        else if (bookName.equals("Grinch")){
            //How The Grinch Stole Christmas
            title.setText("How The Grinch Stole Christmas");
            author.setText("Dr. Seuss");

            textOne.setText(" 'The Grinch hated Christmas! " +
                    "The whole Christmas season! Now, please " +
                    "don't ask why. No one quite knows the reason." +
                    "' Dr. Seuss' classic christmas-time book is " +
                    "a traditional story that both young and old " +
                    "continue to love and cherrish.");
            buyLink = "http://www.amazon.com/gp/aw/d/0394800796/ref=mp_s_a_1_1?qid=1450093271&sr=8-1&pi=SY200_QL40&keywords=how+the+grinch+stole+christmas+book&dpPl=1&dpID=512PxXsTebL&ref=plSrch";
            titleString = "How The Grinch Stole Christmas";
            authorString = "Dr. Seuss";
            bookCoverString = "grinchstolechristmas";
            image.setBackgroundResource(R.drawable.grinchstolechristmas);

        }
        else if (bookName.equals("PolarExpress")) {
            //The Polar Express
            title.setText("The Polar Express");
            author.setText("Chris Van Allsburg");

            textOne.setText("Lying awake on Christmas eve, " +
                    "a young boy is swept away to visit the " +
                    "North Pole with Santa. The mysterious " +
                    "journey is a beloved classic, destine to " +
                    "get every child excited for the holidays.");
            buyLink = "http://www.amazon.com/gp/aw/d/0544580141/ref=mp_s_a_1_1?qid=1450093300&sr=8-1&pi=SX200_QL40&keywords=the+polar+express+book&dpPl=1&dpID=519LkZvfH8L&ref=plSrch";
            titleString = "The Polar Express";
            authorString = "Chris Van Allsburg";
            bookCoverString = "polarexpress";
            image.setBackgroundResource(R.drawable.polarexpress);
        }

        else if (bookName.equals("Valentines")) {
            //Happy Valentine's Day, Mouse!
            title.setText("Happy Valentine's Day, Mouse!");
            author.setText("Laura Numeroff");

            textOne.setText("From the author of 'If You Give a " +
                    "Mouse a Cookie, mouse and his friends " +
                    "celebrate the loving holiday of chocolate and cards.' ");
            buyLink = "http://www.amazon.com/gp/aw/d/0061804320/ref=mp_s_a_1_1?qid=1450093326&sr=8-1&pi=SY200_QL40&keywords=happy+valentines+day+mouse&dpPl=1&dpID=61baKTsvG9L&ref=plSrch";
            titleString = "Happy Valentine's Day, Mouse!";
            authorString = "Laura Numeroff";
            bookCoverString = "valentinesdaymouse";
            image.setBackgroundResource(R.drawable.valentinesdaymouse);

        }

        else if (bookName.equals("FourthOfJuly")) {
            //Fourth of July Mice
            title.setText("Fourth of July Mice");
            author.setText("Bethany Roberts ");

            textOne.setText("Four little mice fill their " +
                    "patriotic day with traditonal activities " +
                    "like parades, fireworks, and swimming. " +
                    "The watercolor illustrations and rhyming " +
                    "help depict the celebratory rituals of " +
                    "Independence day.");
            buyLink = "http://www.amazon.com/gp/aw/d/0544226054/ref=mp_s_a_1_1?qid=1450093365&sr=8-1&pi=SY200_QL40&keywords=fourth+of+july+mice&dpPl=1&dpID=614HucGfoLL&ref=plSrch";
            titleString = "Fourth of July Mice";
            authorString = "Bethany Roberts";
            bookCoverString = "mice";
            image.setBackgroundResource(R.drawable.mice);

        }
        else if (bookName.equals("Froggy")){
            //Froggy's Day with Dad
            title.setText("Froggy's Day with Dad");
            author.setText("Jonathan London");

            textOne.setText("Froggy wants to celebrate Father's " +
                    "day by a golf outing, but when little " +
                    "froggy hits his dad with a club it seems " +
                    "like the day couldn't get any worse.");
            buyLink = "http://www.amazon.com/gp/aw/d/0142406341/ref=mp_s_a_1_1?qid=1450093397&sr=8-1&pi=SX200_QL40&keywords=froggys+day+with+dad&dpPl=1&dpID=61Vtz-xeA-L&ref=plSrch#";
            titleString = "Froggy's Day with Dad";
            authorString = "Jonathan London";
            bookCoverString = "froggysdaywithdad";
            image.setBackgroundResource(R.drawable.froggysdaywithdad);

        }
        else if (bookName.equals("Flag")){
            //A Flag for All
            title.setText("A Flag for All");
            author.setText("Larry Dane Brimner");

            textOne.setText("The American Flag is filled with " +
                    "stars and stripes, but what do they " +
                    "actually mean? 'A Flag for All teaches " +
                    "children the representation behind the " +
                    "national flag and the different meanings " +
                    "for different people.' ");
            buyLink = "http://www.amazon.com/gp/aw/d/0516245252/ref=mp_s_a_1_1?qid=1450093428&sr=8-1&keywords=a+flag+for+all&pi=SY200_QL40&dpPl=1&dpID=51C9xQoNZbL&ref=plSrch";
            titleString = "A Flag for All";
            authorString = "Larry Dane Brimner";
            bookCoverString = "aflagforall";
            image.setBackgroundResource(R.drawable.flagforall);


        }
        else if (bookName.equals("SummerCamp")){
            //The Night Before Summer Camp
            title.setText("The Night Before Summer Camp");
            author.setText("Natasha Wing");

            textOne.setText("It's almost time for the first " +
                    "day of summer camp, but one little camper " +
                    "catches a case of the butterflies.");
            buyLink = "http://www.amazon.com/Night-Before-Summer-Camp/dp/0448446391/ref=sr_1_1?ie=UTF8&qid=1449073986&sr=8-1&keywords=the+night+before+summer+camp";
            titleString = "The Night Before Summer Camp";
            authorString = "Natasha Wing";
            bookCoverString = "camp";
            image.setBackgroundResource(R.drawable.camp);
        }
        else if (bookName.equals("Beach")){
            //Beach Day!
            title.setText("Beach Day!");
            author.setText("Patricia Lakin");

            textOne.setText("Four alligator friends want " +
                    "to escape the heat, and decide to take " +
                    "a trip to the beach. But they get lost " +
                    "along the way. Will they ever make it?");
            buyLink="http://www.amazon.com/gp/aw/d/0448446391/ref=mp_s_a_1_1?qid=1450093480&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=the+night+before+summer+camp";
            titleString = "Beach Day!";
            authorString = "Patricia Lakin";
            bookCoverString = "beach";
            image.setBackgroundResource(R.drawable.beach);
        }
        else if (bookName.equals("FunDog")){
            //Fun Dog, Sun Dog
            title.setText("Fun Dog, Sun Dog");
            author.setText("Deborah Heiligman");

            textOne.setText("Tinka, a sandy golden retriever, " +
                    "and his best friend and owner spend " +
                    "a busy day at the beach.");
            buyLink="http://www.amazon.com/gp/aw/d/0761458360/ref=mp_s_a_1_1?qid=1450093665&sr=8-1&pi=SX200_QL40&keywords=fun+dog+sun+dog&dpPl=1&dpID=512NHMfFH1L&ref=plSrch";
            titleString = "Fun Dog, Sun Dog";
            authorString = "Deborah Heiligman";
            bookCoverString = "fundog";
            image.setBackgroundResource(R.drawable.fundog);
        }
        if (bookName.equals("Pumpkin")){
            //Duck & Goose, Find a Pumpkin
            title.setText("Duck & Goose, Find a Pumpkin");
            author.setText("Tad Hills ");

            textOne.setText("Duck and Goose want to find a " +
                    "pumpkin just like their friend Thistle. " +
                    "So the two set out on a mission looking " +
                    "everywhere to find a pumpkin. Written " +
                    "by NY Times Best Seller, Tad Hils, readers " +
                    "will love the autumn-colored oil painting " +
                    "illustrations.");
            buyLink = "http://www.amazon.com/gp/aw/d/030798155X/ref=mp_s_a_1_1?qid=1450093701&sr=8-1&pi=SY200_QL40&keywords=duck+and+goose+find+a+pumpkin&dpPl=1&dpID=51Xbs3w-ovL&ref=plSrch";
            titleString = "Duck & Goose, Find a Pumpkin";
            authorString = "Tad Hills";
            bookCoverString = "duckandgoose";
            image.setBackgroundResource(R.drawable.duckandgoose);
        }
        else if (bookName.equals("Parade")){
            //Milly and the Macy's Parade
            title.setText("Milly and the Macy's Parade");
            author.setText("Shana Corey");

            textOne.setText("Milly lives in NYC, but her immigrant " +
                    "family longs for their polish traditions as " +
                    "the holiday seasons kicks off. Hoping to mix " +
                    "her old traditions with the new, Milly " +
                    "reaches out to Mr. Macy to bring the two together.");
            buyLink="http://www.amazon.com/gp/aw/d/0439297559/ref=mp_s_a_1_1?qid=1450093730&sr=8-1&pi=SX200_QL40&keywords=milly+and+the+macy%27s+parade&dpPl=1&dpID=61WOsc4AWbL&ref=plSrch";
            titleString = "Parade";
            authorString = "Milly and Macy's Parade";
            bookCoverString = "milly";
            image.setBackgroundResource(R.drawable.milly);
        }
        else if (bookName.equals("Wiener")){
            //The Hallo-Wiener
            title.setText("The Hallo-Wiener");
            author.setText("Dav Pilkey");

            textOne.setText("Oscar the Doschand is short like " +
                    "other dogs his type, but his friends often" +
                    " ridicule him. When it's time for Halloween" +
                    " season, the jokes come at full-swing as he" +
                    " dresses up as a hot dog. Oscar channels" +
                    " the negativity into courage and becomes a Grade-A hero.");
            buyLink="http://www.amazon.com/gp/aw/d/0439079462/ref=mp_s_a_1_1?qid=1450093776&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=hallo+weiner";
            titleString = "The Hallo-Wiener";
            authorString = "Dav Pilkey";
            bookCoverString = "thehallowiener";
            image.setBackgroundResource(R.drawable.thehallowiener);
        }
        if (bookName.equals("LovesFall")){
            //Who Loves the Fall?
            title.setText("Who Loves the Fall?");
            author.setText("Bob Raczka");

            textOne.setText("Set to rhyme, Bob Razca shares all " +
                    "the special changes in nature that make " +
                    "this time of year fall. The bright illustrations " +
                    "will keep readers intrigued and looking " +
                    "forward to celebrating the new season.");
            buyLink="http://www.amazon.com/gp/aw/d/B00JRMXXCO/ref=mp_s_a_1_1?qid=1450093804&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=who+loves+fall";
            titleString = "Who Loves The Fall?";
            authorString = "Bob Raczka";
            bookCoverString = "lovefall";
            image.setBackgroundResource(R.drawable.lovefall);
        }
        else if (bookName.equals("LetItFall")){
            //Let It Fall
            title.setText("Let It Fall");
            author.setText("Maryann Cocca-Leffler");

            textOne.setText("A short, easy reader to get into " +
                    "the autumn spirit. The book features beautiful " +
                    "outdoor shots, adorable children, and " +
                    "seasonal activities to teach all about " +
                    "the coming months of autumn.");
            buyLink="http://www.amazon.com/gp/aw/d/0545208793/ref=mp_s_a_1_1?qid=1450093830&sr=8-1&keywords=let+if+fall&dpPl=1&dpID=61q9sVWrI1L&ref=plSrch&pi=SY200_QL40";
            titleString = "Let It Fall";
            authorString = "Maryann Cocca-Leffler";
            bookCoverString = "letitfall";
            image.setBackgroundResource(R.drawable.letitfall);
        }
        else if (bookName.equals("Apples")){
            //Autumn Is for Apples
            title.setText("Autumn Is for Apples");
            author.setText("Michelle Knudsen");

            textOne.setText("Michelle Knudsen's simple story is " +
                    "perfect for kids to use their imagination." +
                    " From apple picking to an afternoon picnic, " +
                    "readers explore the seasonal offerings all " +
                    "set to rhyme.");
            buyLink="http://www.amazon.com/gp/aw/d/B00HBQJ4BM/ref=mp_s_a_1_1?qid=1450094590&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=autumn+is+for+apples";
            titleString = "Autumn is for Apples";
            authorString = "Michelle Knudsen";
            bookCoverString = "apples";
            image.setBackgroundResource(R.drawable.apples);
        }
        else if (bookName.equals("Bunnies")){
            //The Dumb Bunnies Easter
            title.setText("The Dumb Bunnies Easter");
            author.setText("Dav Pilkey");

            textOne.setText("The humurous mind of Dav Pilkey" +
                    " comes an Easter bestseller about the dumb " +
                    "bunnies who actually are celebrating Christmas. " +
                    "The goofy tale is a fun read for all.");
            buyLink="http://www.amazon.com/gp/aw/d/0545008808/ref=mp_s_a_1_1?qid=1450093854&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=the+dumb+bunnies+easter";
            titleString = "The Dumb Bunnies Easter";
            authorString = "Dav Pilkey";
            bookCoverString = "bunnieseaster";
            image.setBackgroundResource(R.drawable.bunnieseaster);

        }
        else if (bookName.equals("AprilFool")){
            //April Fool!
            title.setText("April Fool!");
            author.setText("Karen Gray Ruelle");

            textOne.setText("Harry the cat, his little sister " +
                    "Emily, and their parents all play tricks " +
                    "on each other for April Fools' Day.");
            buyLink="http://www.amazon.com/gp/aw/d/0823416860/ref=mp_s_a_1_1?qid=1450093892&sr=8-1&keywords=April+fool%21+Karen#";
            titleString = "April Fool!";
            authorString = "Karen Gray Ruelle";
            bookCoverString = "aprilfool";
            image.setBackgroundResource(R.drawable.aprilfool);

        }
        else if (bookName.equals("Brunch")){
            //Fancy Nancy's Marvelous Mother's Day Brunch
            title.setText("Fancy Nancy's Marvelous Mother's Day Brunch");
            author.setText("Jane O'Connor");

            textOne.setText("Nancy wants to plan the best Mother's" +
                    " day yet, so she's pulling out all the stops." +
                    " Illustrated with thirteen flaps, readers " +
                    "can see all the surprises Nancy plans in " +
                    "order to make the day special.");
            buyLink="http://www.amazon.com/gp/aw/d/006170380X/ref=mp_s_a_1_1?qid=1450093944&sr=8-1&pi=SY200_QL40&keywords=fancy+nancy%27s+marvelous+mother%27s+day+brunch&dpPl=1&dpID=61Z9D8v6J%2BL&ref=plSrch";
            titleString = "Fancy Nancy's Marvelous Mother's Day Brunch";
            authorString = "Jane O'Conner";
            bookCoverString = "fancynancy";
            image.setBackgroundResource(R.drawable.fancynancy);

        }
        else if (bookName.equals("Spring")){
            //And Then It's Spring
            title.setText("And Then It's Spring");
            author.setText("Julie Fogliano");

            textOne.setText("After a snowy winter, a boy " +
                    "and his dog dig, and dig, and dig hoping" +
                    " to sprout a garden. The story is " +
                    "brought to life with beautiful illustrations" +
                    " and teaches the importance of patience.");
            buyLink = "http://www.amazon.com/gp/aw/d/1596436247/ref=mp_s_a_1_1?qid=1450093961&sr=8-1&pi=AC_SX118_SY170_QL70&keywords=and+then+it%27s+spring";
            titleString = "And Then It's Spring";
            authorString = "Julie Fogliano";
            bookCoverString = "itsspring";
            image.setBackgroundResource(R.drawable.itsspring);

        }
       else if (bookName.equals("Rain")){
            //Let It Rain
            title.setText("Let It Rain");
            author.setText("Maryann Cocca-Leffler ");

            textOne.setText("Three young kids and their dog " +
                    "try all the spring activities from gardening" +
                    " to kicking around a soccer ball. " +
                    "The light-hearted picture book is a perfect " +
                    "celebration of springtime.");
            buyLink = "http://www.amazon.com/gp/aw/d/0545453437/ref=mp_s_a_1_2?qid=1450093983&sr=8-2&pi=SY200_QL40&keywords=let+it+rain&dpPl=1&dpID=61ZfPAj6FbL&ref=plSrch\n";
            titleString = "Let It Rain";
            authorString = "Maryann Cocca-Leffler";
            bookCoverString = "rain";
            image.setBackgroundResource(R.drawable.rain);

        }
        else if (bookName.equals("Hurray")) {
            //Hurray For Spring
            title.setText("Hurray For Spring");
            author.setText("Patricia Hubbell");

            textOne.setText("Patricia Hubbell's book is an anthem " +
                    "to spring. The sensory trip of spring " +
                    "activities will get all who are reading " +
                    "excited for the new season.");
            buyLink = "http://www.amazon.com/gp/aw/d/1559719133/ref=mp_s_a_1_1?qid=1450094015&sr=8-1&pi=SY200_QL40&keywords=hurray+for+spring&dpPl=1&dpID=51il3MiBbxL&ref=plSrch";
            titleString = "Hurray For Spring";
            authorString = "Patricia Hubbell";
            bookCoverString = "hurrayspring";
            image.setBackgroundResource(R.drawable.hurrayspring);
        }



    }

    //I cant get the class to add a record to the database for the wishlist, tried for hours. Subtract points from me, not Katie or Rachel.
    //It is supposed to be adding a record to the wishlist table based upon which specific book discription is up. 
    public void addToWishList(String author, String title, String cover){

        String myPath = DB_PATH + DB_NAME;
        SQLiteDatabase db = SQLiteDatabase.openDatabase(myPath, null,
                SQLiteDatabase.OPEN_READWRITE);

        //String query = "INSERT INTO wishList (TITLE, AUTHOR, COVER)"+"VALUES ("+titleString+", "+authorString+", "+bookCoverString+")";

        ContentValues row = new ContentValues();
        row.put(TITLE, author);
        row.put(AUTHOR, title);
        row.put(COVER, cover);
        db.insert(TABLE_NAME, null, row);
        db.close();
        /*
        try{
            //Intent intent = new Intent(BookDescription.this, WishList.class);
            //intent.putExtra("book", titleString);
            //startActivity(intent);

            //db.execSQL(query);

        }catch(SQLiteException se){
            Log.e(getClass().getSimpleName(), "Could not open the database");
        }finally{
            if (db != null)
                db.close();
        }
        */



    }

    public void toWishList (View view){
        Intent intent = new Intent(this, WishList.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book_description, menu);
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
    public void toHome(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }

    public void buyNow(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(buyLink));
        startActivity(browserIntent);
    }

    private void copyDataBase() throws IOException {
        InputStream myInput = getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer))>0) {myOutput.write(buffer,0,length);
        }

        myOutput.flush();
        myOutput.close();
        myInput.close();
    }
}
