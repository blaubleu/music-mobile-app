package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(Activity context, ArrayList<Songs> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.activity_album, parent, false);
        }

        Songs currentSong = getItem(position);

        ImageView cover = listView.findViewById(R.id.cover);
        cover.setImageResource(currentSong.getCover());

        TextView artist = listView.findViewById(R.id.artistDetail);
        artist.setText(currentSong.getArtist());

        TextView song = listView.findViewById(R.id.songDetail);
        song.setText(currentSong.getSong());

        return listView;
    }
}
