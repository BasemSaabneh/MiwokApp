package com.example.android.miwokapp;

public class Phases {

    private String mDefaultPhases;
    private String mMiwokPhases;

    public Phases(String mDefaultPhases, String mMiwokPhases) {
        this.mDefaultPhases = mDefaultPhases;
        this.mMiwokPhases = mMiwokPhases;
    }

    public String getmDefaultPhases() {
        return mDefaultPhases;
    }

    public void setmDefaultPhases(String mDefaultPhases) {
        this.mDefaultPhases = mDefaultPhases;
    }

    public String getmMiwokPhases() {
        return mMiwokPhases;
    }

    public void setmMiwokPhases(String mMiwokPhases) {
        this.mMiwokPhases = mMiwokPhases;
    }
}
