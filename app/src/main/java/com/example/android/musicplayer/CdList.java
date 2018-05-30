package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CdList implements Parcelable {
    private int mCover;
    private String mArtist;
    private String mSong;
    public ArrayList<Indochine> indochine;

    public CdList(){}

    public CdList(int mCover, String mArtist, String mSong, ArrayList<Indochine> indochine){
        this.mCover = mCover;
        this.mArtist = mArtist;
        this.mSong = mSong;
        this.indochine = indochine;
    }

    //public static ArrayList<Songs> cdList = new ArrayList <>();

    /*CdList(int cover, String artist, String song){
        cdList.add(new Songs(R.drawable.cdList, "CdList", "J'ai demandé à la lune"));
        cdList.add(new Songs(R.drawable.cdList, "CdList", "Punker"));
        cdList.add(new Songs(R.drawable.cdList, "CdList", "Glory Hole"));
    }*/

    protected CdList(Parcel in) {
        mCover = in.readInt();
        mArtist = in.readString();
        mSong = in.readString();
        this.indochine = in.readArrayList(null);
    }

    public static final Creator <CdList> CREATOR = new Creator <CdList>() {
        @Override
        public CdList createFromParcel(Parcel in) {
            return new CdList(in);
        }

        //this is what will let me pass the info to the intent
        @Override
        public CdList[] newArray(int size) {
            return new CdList[size];
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
