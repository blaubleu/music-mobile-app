package com.example.android.musicplayer;

import java.util.ArrayList;

/**
 * Implemented using supporting information available at Tutorials Point https://www.tutorialspoint.com/java/java_arraylist_class.htm
 */

public class ArtistList {

        public static ArrayList<Artist> artists = new ArrayList <>();

    ArtistList(){

        // array
        artists.add(new Artist(R.drawable.indochine3, "Indochine", "J'ai demandé à la lune"));
        artists.add(new Artist(R.drawable.sodastereo2, "Soda Stereo", "Canción Animal"));
        artists.add(new Artist(R.drawable.louiseattaque3, "Louise Attaque", "à plus tard crocodile"));
        artists.add(new Artist(R.drawable.texas2, "Texas", "The Greatest Hits"));
        artists.add(new Artist(R.drawable.melancholia2, "Melancholia", "Prague Philharmonic Orchestra"));
        artists.add(new Artist(R.drawable.ninasimone2, "Nina Simone", "The Very Best of Nina Simone"));
        artists.add(new Artist(R.drawable.amelie2, "Amélie", "Yann Tiersen"));
        artists.add(new Artist(R.drawable.doctorstrange2, "Doctor Strange", "Michael Giacchino"));

    }
}
