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

public class ArtistAdapter extends ArrayAdapter<Artist> {
    private static final String LOG_TAG = ArtistAdapter.class.getSimpleName();

    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    /**
     * Return views and set the logic for view recycling
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View mainView = convertView;
        if (mainView == null){
            mainView = LayoutInflater.from(getContext()).inflate(R.layout.activity_artist, parent, false);
        }

        Artist currentArtist = getItem(position);

        ImageView imageView = (ImageView) mainView.findViewById(R.id.cover);
        imageView.setImageResource(currentArtist.getImageId());

        TextView artistMain  = mainView.findViewById(R.id.artist);
        artistMain.setText(currentArtist.getArtist());

        TextView albumMain = mainView.findViewById(R.id.album);
        albumMain.setText(currentArtist.getAlbum());

        return mainView;
    }
}
