package com.delaroystudios.cardview;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Album {
    private String name;
    private int BarCover;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int BarCover, int thumbnail) {
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

    public int getNumOfSongs() {
        return BarCover;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.BarCover = BarCover;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
