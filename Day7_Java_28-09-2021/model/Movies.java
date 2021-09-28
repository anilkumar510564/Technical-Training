package com.torryharris.model;

public class Movies implements Comparable<Movies> {
    private String title;
    private Integer yearOfRelease;
    private Float imdbRating;
    private Float collections;
    @Override
    public int compareTo(Movies o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    public Movies(String title, int yearOfRelease, Float imdbRating, Float collections) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.imdbRating = imdbRating;
        this.collections = collections;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(Float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Float getCollections() {
        return collections;
    }

    public void setCollections(Float collections) {
        this.collections = collections;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", imdbRating=" + imdbRating +
                ", collections=" + collections +
                '}';
    }
}
