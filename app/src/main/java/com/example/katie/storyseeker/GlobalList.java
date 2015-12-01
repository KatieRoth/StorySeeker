package com.example.katie.storyseeker;

import android.app.Application;

public class GlobalList extends Application {
    private boolean herald = false;
    private boolean giraffe = false;

    public boolean getHerald(){
        return this.herald;
    }

    public void setHerald(boolean b){
        this.herald = b;
    }

    public boolean getGirffe(){
        return this.giraffe;
    }

    public void setGiraffe(boolean b){
        this.giraffe = b;
    }
}