package com.torryharris.model;

public class CarsMusicSystem {
    private String musicSystemName;
    private int noOfSpeakers;
    private boolean subWoofer;
    private int lcdScreenSize;

    public CarsMusicSystem(String musicSystemName, int noOfSpeakers, boolean subWoofer, int lcdScreenSize) {
        this.musicSystemName=musicSystemName;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
        this.lcdScreenSize = lcdScreenSize;
    }

    public String getMusicSystemName() {
        return musicSystemName;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setMusicSystemName(String musicSystemName) {
        this.musicSystemName = musicSystemName;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public void setSubWoofer(boolean subWoofer) {
        this.subWoofer = subWoofer;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}

