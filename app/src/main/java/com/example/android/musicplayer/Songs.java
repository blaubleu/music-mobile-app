package com.example.android.musicplayer;

public class Songs {
    private int mCover = NO_COVER;
    private String mArtist = NO_ARTIST;
    private String mSong;

    private static final int NO_COVER = -1;
    private static final String NO_ARTIST = "n/a";

    /**
     * Main display contructor
     * @param cover
     * @param artist
     * @param song
     */
    public Songs(int cover, String artist, String song){
        mCover = cover;
        mArtist = artist;
        mSong = song;
    }

    /**
     * Song list constructor
     * @param song
     */
    public Songs(String song){
        mSong = song;
    }

    // getters
    public int getCover(){
        return mCover;
    }

    public boolean hasCover(){
        return mCover != NO_COVER;
    }

    public String getArtist(){
        return mArtist;
    }

    public boolean hasArtist(){
        return mArtist != NO_ARTIST;
    }

    public String getSong(){
        return mSong;
    }

}
