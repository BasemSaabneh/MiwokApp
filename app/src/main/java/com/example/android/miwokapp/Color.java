package com.example.android.miwokapp;

public class Color {

    private String mDefaultColor;
    private String mMiwokColor;

    public Color(String mDefaultColor, String mMiwokColor) {
        this.mDefaultColor = mDefaultColor;
        this.mMiwokColor = mMiwokColor;
    }

    public String getmDefaultColor() {
        return mDefaultColor;
    }

    public void setmDefaultColor(String mDefaultColor) {
        this.mDefaultColor = mDefaultColor;
    }

    public String getmMiwokColor() {
        return mMiwokColor;
    }

    public void setmMiwokColor(String mMiwokColor) {
        this.mMiwokColor = mMiwokColor;
    }
}
