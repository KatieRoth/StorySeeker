package com.example.katie.storyseeker;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;

/**
 * Created by maxitaxi_kindred on 12/10/15.
 */
public class GlobalBook  implements Parcelable{
    public String title;
    public String author;
    public String bookCover;

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setBookCover(String bookCover){
        this.bookCover = bookCover;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getBookCover(){
        return bookCover;
    }

    public void writeToParcel(Parcel parcel, int flags){
        parcel.writeString(title);
        parcel.writeString(author);
        parcel.writeString(bookCover);
    }

    public int describeContents(){
        return 0;
    }
    public static Creator<GlobalBook> CREATOR = new Creator<GlobalBook>() {
        @Override
        public GlobalBook createFromParcel(Parcel source) {

            GlobalBook gbook = new GlobalBook();
            gbook.title = source.readString();
            gbook.author = source.readString();
            gbook.bookCover = source.readString();
            return gbook;
        }
        @Override
        public GlobalBook[] newArray(int size) {
            return new GlobalBook[size];
        }
    };
}
