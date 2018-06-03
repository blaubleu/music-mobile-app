package com.example.android.musicplayer;

public class Songs extends Indochine {
    private int mCover;
    private String mArtist;
    private String mSong;

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
     * @param indochine
     * @param song
     * @param s
     * @param o
     */
    public Songs(int indochine, String song, String s, Object o){
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

}
