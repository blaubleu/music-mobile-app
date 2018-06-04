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

        //create widgets
        cover = findViewById(R.id.coverDetail);
        song = findViewById(R.id.songDetail);
        artist = findViewById(R.id.artistDetail);

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

        //bring intent data
        Intent iPlay = getIntent();
        position = iPlay.getIntExtra("positon", 0);
        //songs = iPlay.getParcelableExtra("dataKey");
        //iPlay.getExtras();

        String str = iPlay.getStringExtra("songActivity2");
        song.setText(str);

        String str1 = iPlay.getStringExtra("ArtistActivity2");
        artist.setText(str1);

        //Log.i("Received ", String.valueOf(songs));
        //Log.i("data received", songs.get(0).getArtist());

        // call parcelable
        ArrayList<Song> songParcelables = getIntent().getParcelableArrayListExtra("dataKey");
        for (Song songfromArray: songParcelables){
            Log.d(this.getClass().getSimpleName(), songfromArray.getArtist());
            Log.d(this.getClass().getSimpleName(), songfromArray.getSong());
            Log.d(this.getClass().getSimpleName(), String.valueOf(songfromArray.getCover()));
        }

    }

}
