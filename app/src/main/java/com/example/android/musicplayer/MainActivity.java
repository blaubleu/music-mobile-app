package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

//import static com.example.android.musicplayer.IndochineSongList.songs;

/**
 * Implemented using supporting information from SitePoint
 * https://www.sitepoint.com/transfer-data-between-activities-with-android-parcelable/
 */

public class MainActivity extends AppCompatActivity {
    // arraylist that populates MainActivty
    ArrayList<Artist> artists;

    //arrayList that will populate PlayActivity
    ArrayList<Songs> songs = new ArrayList <>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // array list for activity one
        artists = ArtistList.getArtists();
        //get parcelable data
        final Indochine data = new Indochine();

        final ArtistAdapter adapter = new ArtistAdapter(this, artists);

        GridView mainView = findViewById(R.id.main_view);
        mainView.setAdapter(adapter);

        mainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Album.class);
                if (getIntent() != null){
                    intent.putExtra("position", position);
                    //intent.putExtra("cdOpen", "Indochine");
                    intent.putParcelableArrayListExtra("dataKey", songs); // access to array via parcelable class
                }
                startActivity(intent);
            }
        });

        songs.add(new Songs(R.drawable.indochine, "Indochine", "J'ai demandé à la lune"));
        songs.add(new Songs(R.drawable.indochine, "Indochine", "Punker"));
        songs.add(new Songs(R.drawable.indochine, "Indochine", "Glory Hole"));

        //Log.i("send log 6/3/2018", songs.get(0).getSong());
    }
}
