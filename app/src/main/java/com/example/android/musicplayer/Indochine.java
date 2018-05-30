package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import static com.example.android.musicplayer.R.drawable.indochine;

public class Indochine implements Parcelable {
    private int mCover;
    private String mArtist;
    private String mSong;

    public Indochine(){}

    public static ArrayList<Songs> indochine = new ArrayList <>();

    Indochine(int cover, String artist, String song){
        indochine.add(new Songs(R.drawable.indochine, "Indochine", "J'ai demandé à la lune"));
        indochine.add(new Songs(R.drawable.indochine, "Indochine", "Punker"));
        indochine.add(new Songs(R.drawable.indochine, "Indochine", "Glory Hole"));
    }

    protected Indochine(Parcel in) {
        mCover = in.readInt();
        mArtist = in.readString();
        mSong = in.readString();
    }

    public static final Creator <Indochine> CREATOR = new Creator <Indochine>() {
        @Override
        public Indochine createFromParcel(Parcel in) {
            return new Indochine(in);
        }

        //this is what will let me pass the info to the intent
        @Override
        public Indochine[] newArray(int size) {
            return new Indochine[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
      /*  out.writeInt(mCover);
        out.writeString(mArtist);
        out.writeString(mSong);*/
    }
}
