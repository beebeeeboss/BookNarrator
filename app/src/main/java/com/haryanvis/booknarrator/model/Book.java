package com.haryanvis.booknarrator.model;

public class Book {
    private  int bID ;
    private String name , genre , language , srcLink ;
    private double length , rating;

    //default for Getting Purposes
    public Book(){}

    //custom for Setting and preventing from NullException
    public Book(int bID, String name, String genre, String language, String srcLink, double length, double rating) {
        this.bID = bID;
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.srcLink = srcLink;
        this.length = length;
        this.rating = rating;
    }

    public int getbID() {
        return bID;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getSrcLink() {
        return srcLink;
    }

    public double getLength() {
        return length;
    }

    public double getRating() {
        return rating;
    }
}
