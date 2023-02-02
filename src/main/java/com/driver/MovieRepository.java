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
    public void addpair(String m,String d){
        if(pairs.containsKey(d)){
            pairs.get(d).add(movies.get(m));
        }
        else{
            List<Movie> arr = new ArrayList<>();
            arr.add(movies.get(m));
            pairs.put(d,arr);
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
    public List<String> getmovies(){
        List<String> ans = new ArrayList<>();
        for(String x : movies.keySet()){
            ans.add(x);
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
