package com.example.android.miwokapp;

public class Family {

    private String mDefaultFamily;
    private String mMiwokFamily;

    public Family(String mDefaultFamily, String mMiwokFamily) {
        this.mDefaultFamily = mDefaultFamily;
        this.mMiwokFamily = mMiwokFamily;
    }

    public String getmDefaultFamily() {
        return mDefaultFamily;
    }

    public void setmDefaultFamily(String mDefaultFamily) {
        this.mDefaultFamily = mDefaultFamily;
    }

    public String getmMiwokFamily() {
        return mMiwokFamily;
    }

    public void setmMiwokFamily(String mMiwokFamily) {
        this.mMiwokFamily = mMiwokFamily;
    }
}
