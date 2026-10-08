package org.example;

public class LibraryItem {

    public String title;
    public String author;
    public int year;

    public LibraryItem(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        String result = "Item: " + title + " (" + year + ")";
        return result;
    }
}
