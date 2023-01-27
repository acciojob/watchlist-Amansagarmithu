package com.driver;

public class Movie {

    private String name;
    private int durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public Movie(String name, int durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public Movie() {
    }
}
