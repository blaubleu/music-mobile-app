package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Class that implements parcelable
 * Implemented following Coding in Flow tutorials https://codinginflow.com/ as well as
 * Codepath Android Guides https://github.com/codepath/android_guides/wiki/Using-Parcelable
 */

public class Song implements Parcelable {
    private int mCover;
    private String mArtist;
    private String mSong;

    /**
     * Main display contructor
     * @param cover
     * @param artist
     * @param song
     */
    public Song(int cover, String artist, String song){
        mCover = cover;
        mArtist = artist;
        mSong = song;
    }

    // getters
    public int getCover(){
        return mCover;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getSong(){
        return mSong;
    }

    /**
     * implement Parcelable
     * @param in
     */
    protected Song(Parcel in) {
        mCover = in.readInt();
        mArtist = in.readString();
        mSong = in.readString();

    }


    // method that un-parcels information OR creates individual views
    public static final Creator <Song> CREATOR = new Creator <Song>() {
        @Override
        public Song createFromParcel(Parcel parcel) {
            return new Song(parcel);
        }

        //this is what will let me pass the info to the intent
        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mCover);
        dest.writeString(this.mArtist);
        dest.writeString(this.mSong);
    }

}
