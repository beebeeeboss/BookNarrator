package com.haryanvis.booknarrator.model;

import android.graphics.Bitmap;

public class Book {
    private  int bID ;
    private String name , genre , language , srcLink ;
    private double length , rating;
    private String coverImage;

    //default for Getting Purposes
    public Book(){}

    //custom for Setting and preventing from NullException
    public Book(int bID, String name, String genre, String language, String srcLink, double length, double rating , String coverImage) {
        this.bID = bID;
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.srcLink = srcLink;
        this.length = length;
        this.rating = rating;
        this.coverImage = coverImage;
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

    public String getCoverImage() {
        return coverImage;
    }
}
