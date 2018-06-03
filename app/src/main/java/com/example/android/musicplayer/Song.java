package com.example.android.musicplayer;

public class Song extends SongParcelable {
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
}
