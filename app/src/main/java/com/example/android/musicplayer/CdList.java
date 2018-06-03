package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CdList {

    public static ArrayList<Indochine> songs = new ArrayList <>();

    CdList(){
        songs.add(new Songs(R.drawable.indochine, "Indochine", "J'ai demandé à la lune",songs));
        //songs.add(new Songs(R.drawable.indochine, "Indochine", "Punker"));
        //songs.add(new Songs(R.drawable.indochine, "Indochine", "Glory Hole"));
    }

}
