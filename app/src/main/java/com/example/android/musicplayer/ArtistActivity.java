package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Artist> artists = new ArrayList <Artist>();
        artists.add(new Artist(R.drawable.sodastereo2, "Soda Stereo", "Canción Animal"));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        GridView mainView = findViewById(R.id.main_view);
        mainView.setAdapter(adapter);
    }
}
