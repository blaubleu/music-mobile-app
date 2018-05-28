package com.example.android.musicplayer;

public class Artist {
    private int mImageId;
    private String mArtist;
    private String mAlbum;

    /**
     * Constructor
     * @param imageId
     * @param artist
     * @param album
     */
    public Artist(int imageId, String artist, String album){
        mImageId = imageId;
        mArtist = artist;
        mAlbum = album;
    }


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
