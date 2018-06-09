package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {
    private int mImageId;
    private String mArtist;
    private String mAlbum;

    /**
     * Constructor that sets the model for MainActivity
     * @param imageId
     * @param artist
     * @param album
     */
    public Artist(int imageId, String artist, String album){
        mImageId = imageId;
        mArtist = artist;
        mAlbum = album;
    }

    // this constructor will provide the data set for AlbumActivity
    public Artist(String artist, String album, int imageId){
        mArtist = artist;
        mAlbum = album;
        mImageId = imageId;
    }

    /**
     * Implementing Parcelable
     * @param in
     */
    protected Artist(Parcel in) {
        mImageId = in.readInt();
        mArtist = in.readString();
        mAlbum = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageId);
        dest.writeString(mArtist);
        dest.writeString(mAlbum);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator <Artist> CREATOR = new Creator <Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    // Getters
    public int getImageId(){
        return mImageId;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }
}
