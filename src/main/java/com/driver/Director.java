package com.driver;

public class Director {
    private String name;

   private double imdbRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Director(String name, double imdbRating) {
        this.name = name;
        this.imdbRating = imdbRating;
    }

    public Director() {
    }
}
