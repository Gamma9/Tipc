package com.delaroystudios.cardview;

public class Bar {
    private String name;
    private int BarCover;
    private int thumbnail;

    public Bar() {
    }

    public Bar(String name, int BarCover, int thumbnail) {
        this.name = name;
        this.BarCover = BarCover;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBars() {
        return BarCover;
    }

    public void setNumOfBars(int numOfBars) {
        this.BarCover = BarCover;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
