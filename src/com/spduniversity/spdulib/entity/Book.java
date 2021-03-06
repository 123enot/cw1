package com.spduniversity.spdulib.entity;

import java.util.Arrays;

public class Book extends Item {
    private int publicationYear;    // 2017
    private String publisher;   // O'Relly
    private String[] authors;
    private String genre;   // Engineering, Business, Programming
    private String language;    // English, Russian, etc
    private double amazonRating;

    public Book(
            long id,
            String title,
            String url,
            int publicationYear,
            String publisher,
            String[] authors,
            String genre,
            String language,
            double amazonRating
    ) {
        super(id, title, url);
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.authors = authors;
        this.genre = genre;
        this.language = language;
        this.amazonRating = amazonRating;
    }

    public String toString() {
        return getTitle() + " " + Arrays.toString(authors) + " " + publicationYear + " " + amazonRating;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }
}
