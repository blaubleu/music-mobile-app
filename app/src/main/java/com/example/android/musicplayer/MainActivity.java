package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new ArtistList();

        final ArtistAdapter adapter = new ArtistAdapter(this, ArtistList.artists);

        GridView mainView = findViewById(R.id.main_view);

        mainView.setAdapter(adapter);

        mainView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                /*Intent intent = new Intent(MainActivity.this, Album.class);
                intent.putExtra("position", position);
                startActivity(intent);*/

                Indochine datatToSend = new Indochine();
                Intent i = new Intent(MainActivity.this, Album.class);
                i.putExtra("Indochine",datatToSend);
                startActivity(i);
            }
        });

    }
}
