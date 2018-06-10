package com.example.android.miwokapp;

public class Word {

    private String mDefault;
    private String mMiwok;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1 ;

    public Word(String mDefault, String mMiwok) {
        this.mDefault = mDefault;
        this.mMiwok = mMiwok;

    }

    public Word(String mDefault, String mMiwok, int mImageResourceId) {
        this.mDefault = mDefault;
        this.mMiwok = mMiwok;
        this.mImageResourceId=mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmDefault() {
        return mDefault;
    }

    public void setmDefault(String mDefault) {
        this.mDefault = mDefault;
    }

    public String getmMiwok() {
        return mMiwok;
    }

    public void setmMiwok(String mMiwok) {
        this.mMiwok = mMiwok;
    }

    /**
     *
     * @return whether has an image or not
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
