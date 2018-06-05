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


public class AlbumActivity extends AppCompatActivity {
    int position;

    ArrayList<Song> songs = new ArrayList <>();

    ImageView cover;
    TextView song;
    TextView artist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //logic to switch song list goes here if ever added
                return true;
            }
        });

        // update action bar capabilities on top nav bar!
        getSupportActionBar().setTitle("Playing now:");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //bring intent data from coding in flow
        Intent iPlay = getIntent();

        Song song = iPlay.getParcelableExtra("testIem");
        int cover = song.getCover();
        String artist = song.getArtist();
        String song1 = song.getSong();

        //create widgets
        ImageView imageView = findViewById(R.id.coverDetail);
        imageView.setImageResource(cover);

        TextView textView1 = findViewById(R.id.songDetail);
        textView1.setText(artist);

        TextView textView2 = findViewById(R.id.artistDetail);
        textView2.setText(song1);


        // call parcelable - log used to verify data
     /*   ArrayList<Song> songParcelables = getIntent().getParcelableArrayListExtra("dataKey");
        for (Song songfromArray: songParcelables){
            Log.d(this.getClass().getSimpleName(), songfromArray.getArtist());
            Log.d(this.getClass().getSimpleName(), songfromArray.getSong());
            Log.d(this.getClass().getSimpleName(), String.valueOf(songfromArray.getCover()));
        }*/

    }

}
