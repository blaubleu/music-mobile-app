package com.example.android.musicplayer;

import java.util.ArrayList;

/**
 * Implemented using supporting information from Baeldung
 * http://www.baeldung.com
 */

public class ArtistList {

    public static ArrayList<Artist> getArtists(){

        ArrayList<Artist> artists  = new ArrayList <>();

        // array
        artists.add(new Artist(R.drawable.indochine3, "Indochine", "J'ai demandé à la lune"));
        artists.add(new Artist(R.drawable.sodastereo2, "Soda Stereo", "Canción Animal"));
        artists.add(new Artist(R.drawable.louiseattaque3, "Louise Attaque", "À plus tard crocodile"));
        artists.add(new Artist(R.drawable.texas2, "Texas", "The Greatest Hits"));
        artists.add(new Artist(R.drawable.melancholia2, "Melancholia", "Prague Philharmonic Orchestra"));
        artists.add(new Artist(R.drawable.ninasimone2, "Nina Simone", "The Very Best of Nina Simone"));
        artists.add(new Artist(R.drawable.amelie2, "Amélie", "Yann Tiersen"));
        artists.add(new Artist(R.drawable.doctorstrange2, "Doctor Strange", "Michael Giacchino"));

        return artists;
    }

    // this array populates the playing activity, image sizes are different and we display song names rather than album names
    // for ease of use I kept the same constructor
    public static ArrayList <Artist> getArtists1(){

        ArrayList<Artist> artists1 = new ArrayList <>();

        artists1.add(new Artist("Indochine", "J'ai demandé à la lune - 3:29", R.drawable.indochine));
        artists1.add(new Artist("Soda Stereo", "Canción Animal - 4:06", R.drawable.sodastereo));
        artists1.add(new Artist("Louise Attaque", "Si C'était Hier - 4:28", R.drawable.louiseattaque));
        artists1.add(new Artist("Texas", "Say What You Want - 3:53", R.drawable.texas));
        artists1.add(new Artist("Melancholia", "Intermezzo from Tristan und Isolde: Prelude - 0:44", R.drawable.melancholia));
        artists1.add(new Artist("Nina Simone", "Feeling Good - 2:53", R.drawable.ninasimone));
        artists1.add(new Artist("Amélie", "La Valse d'Amélie - 1:33", R.drawable.amelie));
        artists1.add(new Artist("Doctor Strange", "Go for Baroque - 2:55", R.drawable.doctorstrange));

        return artists1;
    }


    private static class Artist1 {
    }
}
