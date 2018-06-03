package com.example.android.musicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Album extends AppCompatActivity {
    int position;
    //String artist;

    ImageView cover;
    TextView song;
    TextView artist;
    ArrayList <? extends IndochineSongList> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        //add class where songs list lives
        new IndochineSongList();
        //get data from parcelable
        final Indochine data = new Indochine();

        //create widgets
        cover = findViewById(R.id.coverDetail);
        song = findViewById(R.id.songDetail);
        artist = findViewById(R.id.artistDetail);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //logic to switch song list goes here
                return true;
            }
        });

        // update action bar capabilities on top nav bar!
        getSupportActionBar().setTitle("Playing now:");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //bring intent data
        Intent iPlay = getIntent();
        position = iPlay.getIntExtra("positon", 0);
        //songs = iPlay.getParcelableArrayListExtra("dataKey");
        //iPlay.getExtras();
        String str = iPlay.getStringExtra("cdOpen");
        song.setText(str);

        // gave this a try... but could be a deprecated style
        //Indochine songs = getIntent().getParcelableExtra("dataKey");
        //String song = songs.getSong();

        Log.i("Received ", "simple data");
        //Log.i("receive log by Anahi", songs.get(0).getSong());

    }

}
