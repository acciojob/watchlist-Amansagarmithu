package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
   private double imdbRating;

    public String getName() {
        return name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
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

    public Director(String name, double imdbRating,int numberOfMovies) {
        this.name = name;
        this.imdbRating = imdbRating;
        this.numberOfMovies = numberOfMovies;
    }

    public Director() {
    }
}
