package com.driver;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;
    public void addMovie(Movie movie){
        repository.addMovie(movie);
    }
    public void addDirector(Director director){
        repository.addDirector(director);
    }
    public void addpair(RequestDTO dto){
        repository.addpair(dto);
    }
    public Movie getmovie(String moviename){
        return repository.getmovie(moviename);
    }
    public Director getdirector(String directorname){
        return repository.getdirector(directorname);
    }
    public List<String> getList(String directorname){
        return repository.getlist(directorname);
    }
    public List<Movie> getmovies(){
        return repository.getmovies();
    }
    public void deldirector(String directorname){
        repository.deldirector(directorname);
    }
    public void deleteall(){
        repository.deleteall();
    }
}
