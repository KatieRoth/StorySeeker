package com.example.katie.storyseeker;

import android.app.Application;

/**
 * Created by Katie on 11/30/2015.
 */
public class Globals extends Application {
    private boolean haiku = false;
    private boolean teamTrivia = false;

    public boolean getBool(){
        return this.haiku;
    }

    public void setBool(boolean b){
        this.haiku = b;
    }

    public boolean getTrivia(){
        return this.teamTrivia;
    }

    public void setTrivia(boolean b){
        this.teamTrivia = b;
    }
}