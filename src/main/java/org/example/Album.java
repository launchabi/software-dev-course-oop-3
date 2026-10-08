package org.example;

public class Album extends LibraryItem{
    public int getTrackCount() {
        return trackCount;
    }

    protected int trackCount;

    public Album(String title, String author, int year) {
        super(title, author, year);
    }

    public Album(String title, String author, int year, int trackCount){
        super(title, author, year);
        this.trackCount = trackCount;
    }

    @Override
    public String toString(){
        return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }
}
