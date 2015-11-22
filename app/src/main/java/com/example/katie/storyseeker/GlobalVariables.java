package com.example.katie.storyseeker;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class GlobalVariables extends Application {

    private boolean book1 = false;

    private boolean book2 = false;

    private boolean book3 = false;

    public boolean getBook1(){
            return this.book1;
        }

    public void setBook1(boolean b){

        this.book1 = b;
        }

    public boolean getBook2(){

        return this.book2;
        }

    public void setBook2(boolean b){
            this.book2 = b;
        }
    public boolean getBook3(){

        return this.book3;
    }

    public void setBook3(boolean b){
        this.book3 = b;
    }

}

