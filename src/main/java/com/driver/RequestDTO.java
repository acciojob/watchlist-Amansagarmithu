package com.driver;

public class RequestDTO {

    private  String moviename;
    private String directorname;

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getDirectorname() {
        return directorname;
    }

    public void setDirectorname(String directorname) {
        this.directorname = directorname;
    }

    public RequestDTO(String moviename, String directorname) {
        this.moviename = moviename;
        this.directorname = directorname;
    }

    public RequestDTO() {
    }
}
