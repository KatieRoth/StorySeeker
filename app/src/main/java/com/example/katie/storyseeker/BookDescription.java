package com.example.katie.storyseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BookDescription extends AppCompatActivity {

    public String bookName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description);

        Bundle bundle = getIntent().getExtras();
        bookName = bundle.getString("book");


        final TextView textOne = (TextView) findViewById(R.id.textView);

        if (bookName.equals("ColdLady")) {
            //"There Was a Cold Lady Who Swallowed Some Snow!"
            textOne.setText("A snowy take on the traditional 'There Was an Old Lady Who Swalloed A Fly,' Lucille Colandro uses rhymes and beautiful illustrations to depict winter wonderland. Perfect for kindergarten to second graders, readers can guess along as the old lady swallows everything from a hat to coal. The lively ad hilarious book will keep children on their toes with a surprise ending that will leave them begging for more.");

        }


        if (bookName.equals("WinterIs")) {
            //Winter is
            textOne.setText("From sledding to skating and hot cocoa to gingerbread, winter is so many things. Inside Ann Dixon's seasonal book, readers will explore all that winter has to offer. Illustrated in water color, Dixon's celebration of Winter is perfect for tuck-in time.");
        }
        if (bookName.equals("MakingAFriend")){
            //Making a Friend
            textOne.setText("Winter is more than cool temperatures, but the joys of making lasting friendships. When the snow hits the ground, the first thing most do is build a snowman. But what happens when the snow melts? Read more to see how this young boy stays connected to his snowy pal forever.Winter is more than cool temperatures, but the joys of making lasting friendships. When the snow hits the ground, the first thing most do is build a snowman. But what happens when the snow melts? Read more to see how this young boy stays connected to his snowy pal forever.");
        }
        if (bookName.equals("Grinch")){
            //How The Grinch Stole Christmas
            textOne.setText(" 'The Grinch hated Christmas! The whole Christmas season! Now, please don't ask why. No one quite knows the reason.' Dr. Seuss' classic christmas-time book is a traditional story that both young and old continue to love and cherrish.");
        }
        if (bookName.equals("PolarExpress")) {
            //The Polar Express
            textOne.setText("Lying awake on Christmas eve, a young boy is swept away to visit the North Pole with Santa. The mysterious journey is a beloved classic, destine to get every child excited for the holidays.");
        }
        if (bookName.equals("Valentines")) {
            //Happy Valentine's Day, Mouse!
            textOne.setText("From the author of 'If You Give a Mouse a Cookie, mouse and his friends celebrate the loving holiday of chocolate and cards.' ");
        }

        if (bookName.equals("FourthOfJuly")) {
            //Fourth of July Mice
            textOne.setText("Four little mice fill their patriotic day with traditonal activities like parades, fireworks, and swimming. The watercolor illustrations and rhyming help depict the celebratory rituals of Independence day.");
        }
        if (bookName.equals("Froggy")){
            //Froggy's Day with Dad
            textOne.setText("Froggy wants to celebrate Father's day by a golf outing, but when little froggy hits his dad with a club it seems like the day couldn't get any worse.");
        }
        if (bookName.equals("Flag")){
            //A Flag for All
            textOne.setText("The American Flag is filled with stars and stripes, but what do they actually mean? 'A Flag for All teaches children the representation behind the national flag and the different meanings for different people.' ");
        }
        if (bookName.equals("SummerCamp")){
            //The Night Before Summer Camp
            textOne.setText("It's almost time for the first day of summer camp, but one little camper catches a case of the butterflies.");
        }
        if (bookName.equals("Beach")){
            //Beach Day!
            textOne.setText("Four alligator friends want to escape the heat, and decide to take a trip to the beach. But they get lost along the way. Will they ever make it?");
        }
        if (bookName.equals("FunDog")){
            //Fun Dog, Sun Dog
            textOne.setText("Tinka, a sandy golden retriever, and his best friend and owner spend a busy day at the beach.");
        }
        if (bookName.equals("Pumpkin")){
            //Duck & Goose, Find a Pumpkin
            textOne.setText("Duck and Goose want to find a pumpkin just like their friend Thistle. So the two set out on a mission looking everywhere to find a pumpkin. Written by NY Times Best Seller, Tad Hils, readers will love the autumn-colored oil painting illustrations.");
        }
        if (bookName.equals("Parade")){
            //Milly and the Macy's Parade
            textOne.setText("Milly lives in NYC, but her immigrant family longs for their polish traditions as the holiday seasons kicks off. Hoping to mix her old traditions with the new, Milly reaches out to Mr. Macy to bring the two together.");
        }
        if (bookName.equals("Wiener")){
            //The Hallo-Wiener
            textOne.setText("Oscar the Doschand is short like other dogs his type, but his friends often ridicule him. When it's time for Halloween season, the jokes come at full-swing as he dresses up as a hot dog. Oscar channels the negativity into courage and becomes a Grade-A hero.");
        }
        if (bookName.equals("LovesFall")){
            //Who Loves the Fall?
            textOne.setText("Set to rhyme, Bob Razca shares all the special changes in nature that make this time of year fall. The bright illustrations will keep readers intrigued and looking forward to celebrating the new season.");
        }
        if (bookName.equals("LetItFall")){
            //Let It Fall
            textOne.setText("A short, easy reader to get into the autumn spirit. The book features beautiful outdoor shots, adorable children, and seasonal activities to teach all about the coming months of autumn.");
        }
        if (bookName.equals("Apples")){
            //Autumn Is for Apples
            textOne.setText("Michelle Knudsen's simple story is perfect for kids to use their imagination. From apple picking to an afternoon picnic, readers explore the seasonal offerings all set to rhyme.");
        }
        if (bookName.equals("Bunnies")){
            //The Dumb Bunnies Easter
            textOne.setText("The humurous mind of Dav Pilkey comes an Easter bestseller about the dumb bunnies who actually are celebrating Christmas. The goofy tale is a fun read for all.");
        }
        if (bookName.equals("AprilFool")){
            //April Fool!
            textOne.setText("Harry the cat, his little sister Emily, and their parents all play tricks on each other for April Fools' Day.");
        }
        if (bookName.equals("Brunch")){
            //Fancy Nancy's Marvelous Mother's Day Brunch
            textOne.setText("Nancy wants to plan the best Mother's day yet, so she's pulling out all the stops. Illustrated with thirteen flaps, readers can see all the surprises Nancy plans in order to make the day special.");
        }
        if (bookName.equals("Spring")){
            //And Then It's Spring
            textOne.setText("After a snowy winter, a boy and his dog dig, and dig, and dig hoping to sprout a garden. The story is brought to life with beautiful illustrations and teaches the importance of patience.");
        }
        if (bookName.equals("Rain")){
            //Let It Rain
            textOne.setText("Three young kids and their dog try all the spring activities from gardening to kicking around a soccer ball. The light-hearted picture book is a perfect celebration of springtime.");
        }
        if (bookName.equals("Hurray")) {
            //Hurray For Spring
            textOne.setText("Patricia Hubbell's book is an anthem to spring. The sensory trip of spring activities will get all who are reading excited for the new season.");
        }

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
}
