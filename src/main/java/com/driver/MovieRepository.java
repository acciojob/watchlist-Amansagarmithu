package com.driver;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class MovieRepository {

    HashMap<String,Movie> movies = new HashMap<>();
    HashMap<String,Director> directors = new HashMap<>();
    HashMap<String,List<Movie>> pairs = new HashMap<>();

    public void addMovie(Movie movie){
        movies.put(movie.getName(),movie);
    }
    public void addDirector(Director director){
        directors.put(director.getName(),director);
    }
    public void addpair(RequestDTO dto){
        if(pairs.containsKey(dto.getDirectorname())){
            pairs.get(dto.getDirectorname()).add(movies.get(dto.getMoviename()));
        }
        else{
            List<Movie> arr = new ArrayList<>();
            arr.add(movies.get(dto.getMoviename()));
            pairs.put(dto.getDirectorname(),arr);
        }
    }
    public Movie getmovie(String moviename){
        return movies.get(moviename);
    }
    public Director getdirector(String directorname){
        return directors.get(directorname);
    }
    public List<String> getlist(String directorname){
        List<String> ans = new ArrayList<>();
        for(Movie x:pairs.get(directorname)){
            ans.add(x.getName());
        }
        return ans;
    }
    public List<Movie> getmovies(){
        List<Movie> ans = new ArrayList<>();
        for(String x : movies.keySet()){
            ans.add(movies.get(x));
        }
        return ans;
    }
    public void deldirector(String directorname){
        for(Movie m: pairs.get(directorname)){
            movies.remove(m.getName());
        }
        pairs.remove(directorname);
    }
    public void deleteall(){
        movies = new HashMap<>();
        directors = new HashMap<>();
        pairs = new HashMap<>();
    }

}
