package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Implemented using supporting information from
 * SitePoint - https://www.sitepoint.com/transfer-data-between-activities-with-android-parcelable/
 * Codepath - https://github.com/codepath/android_guides/wiki/Using-Parcelable
 * Coding in Flow https://codinginflow.com/tutorials/android/parcelable
 * Acknowledgements to Iip Permana, Rex Sikora, Natalia and Deepak Sharma for all the knowledge shared
 */

public class MainActivity extends AppCompatActivity {
    // initialize array list MainActivity
    ArrayList<Artist> artists;
    // initialize array list for AlbumActivity
    ArrayList<Artist> artists1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get inner class for MainActivity
        artists = ArtistList.getArtists();

        // get inner class for AlbumActivity
        artists1 = ArtistList.getArtists1();

        final ArtistAdapter adapter = new ArtistAdapter(this, artists);

        GridView mainView = findViewById(R.id.main_view);
        mainView.setAdapter(adapter);

        mainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                if (getIntent() != null){
                    intent.putExtra("position", position);
                    intent.putExtra("testIem", artists1.get(position));
                }
                startActivity(intent);
            }
        });

        // following line mostly kept to show the process, this log was used in an earlier iteration
        //Log.i("send log 6/3/2018", songs.get(0).getSong());
    }
}
