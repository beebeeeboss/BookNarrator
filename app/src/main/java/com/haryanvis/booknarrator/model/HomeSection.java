package com.haryanvis.booknarrator.model;

import java.util.List;

public class HomeSection {
     private String sectionTitle;
     private List<Book> books;

    public HomeSection(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public HomeSection(String sectionTitle, List<Book> books) {
        this.sectionTitle = sectionTitle;
        this.books = books;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public List<Book> getBooks() {
        return books;
    }
}
