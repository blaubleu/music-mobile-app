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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // given the rubric, the functionality in this section is deemed out of scope for this project
                return true;
            }
        });

        // top navigation action bar
        getSupportActionBar().setTitle(R.string.topNavBarTxt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // bring intent data from MainActivity
        Intent iPlay = getIntent();
        Artist song = iPlay.getParcelableExtra("testIem");
        String artist = song.getArtist();
        String album = song.getAlbum();
        int cover = song.getImageId();

        //create widgets
        ImageView imageView = findViewById(R.id.coverDetail);
        imageView.setImageResource(cover);

        TextView textView1 = findViewById(R.id.songDetail);
        textView1.setText(artist);

        TextView textView2 = findViewById(R.id.artistDetail);
        textView2.setText(album);
    }

}
