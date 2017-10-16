package com.spduniversity.spdulib.entity;

public class OnlineCourse extends Item {
    private String source;  // Coursera, udemy, edx, Prometheus, etc.
    private String level;   // Basic, Intermediate, Advanced, Hard
    private String[] authors; // Course authors
    private int durationInWeeks; // 6 weeks
    private String language;    // English, Russian, Ukrainian, etc.
    private String genre;       // Programming, Business, Computer Science
    private double rating;      // 4.9

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
