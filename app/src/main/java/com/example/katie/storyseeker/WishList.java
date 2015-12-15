package com.example.katie.storyseeker;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;


//////////http://stackoverflow.com/questions/31227404/set-long-click-listener-for-listview
///// this is not going to work for what I got. I tried this type on thing on my branch
////// KatieList2 but I could not get that working either




public class WishList extends ListActivity{


    LinearLayout layoutOfPopup;
    PopupWindow popupMessage;
    Button popupButton, insidePopupButton;
    TextView popupText;
    Button btnClosePopup;

    List<String> books = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        books.add("Winter Is");
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list, R.id.Itemname, books));
        ListView lv = getListView();
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> av, View v, int pos, long id) {
                //Toast.makeText(WishList.this, "LongClick", Toast.LENGTH_LONG).show();

                initiatePopupWindow();
                //popupInit();

                return true;
            }
        });


        books.add("Please work");
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list, R.id.Itemname, books));
        lv = getListView();
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> av, View v, int pos, long id) {
                initiatePopupWindow();
                return true;
            }
        });

    }


   /* public boolean onItemLongClick(AdapterView<?> l, View v,
                                   final int position, long id) {

        Toast.makeText(this, "long clicked pos: " + position, Toast.LENGTH_LONG).show();

        return true;
    }
    */

    protected void onListItemClick(ListView l, View v, int position, long id)
    {

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

    private PopupWindow pwindo;

    private void initiatePopupWindow() {
        try {
// We need to get the instance of the LayoutInflater
            LayoutInflater inflater = (LayoutInflater) WishList.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.popup,
                    (ViewGroup) findViewById(R.id.popup_element));
            pwindo = new PopupWindow(layout, 300, 370, true);
            pwindo.showAtLocation(layout, Gravity.CENTER, 0, 0);

            btnClosePopup = (Button) layout.findViewById(R.id.btn_close_popup);
            btnClosePopup.setOnClickListener(cancel_button_click_listener);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private View.OnClickListener cancel_button_click_listener = new OnClickClass();

    private class OnClickClass implements View.OnClickListener{
        public void onClick(View v) {
            //Remove Book
            pwindo.dismiss();

        }
    };

    public void home(View view){
        Intent i = new Intent(this, StartScreen.class);
        startActivity(i);
    }



}
