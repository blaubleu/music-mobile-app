package com.example.android.musicplayer;

import java.util.ArrayList;

public class Indochine {

    public static ArrayList<Songs> indochine = new ArrayList <>();

    Indochine() {
            indochine.add(new Songs(R.drawable.indochine, "CdList", "J'ai demandé à la lune"));
            indochine.add(new Songs(R.drawable.indochine, "CdList", "Punker"));
            indochine.add(new Songs(R.drawable.indochine, "CdList", "Glory Hole"));
        }
}
