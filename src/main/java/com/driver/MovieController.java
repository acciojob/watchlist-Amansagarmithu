package com.driver;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    MovieService service;

    @PostMapping("/add_movie")
    public ResponseEntity<String> addMovie(@RequestBody() Movie movie) {
        service.addMovie(movie);
        return new ResponseEntity("Added success", HttpStatus.OK);
    }

    @PostMapping("/add_director")
    public ResponseEntity<String> addDirector(@RequestBody() Director director) {
        service.addDirector(director);
        return new ResponseEntity("Success", HttpStatus.OK);
    }

    @PutMapping("/add_movie_director_pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestBody() RequestDTO dto) {
        service.addpair(dto);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @GetMapping("/get_movie_by_name")
    public ResponseEntity<Movie> getMovieByName(@RequestParam("name") String moviename) {
        Movie ans = service.getmovie(moviename);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/get_director_by_name")
    public ResponseEntity<Director> getDirectorByName(@RequestParam("name") String directorname) {
        Director ans = service.getdirector(directorname);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/get_movies_by_director_name")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@RequestParam("name") String directorname) {
        List<String> ans = service.getList(directorname);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/find_all_movies")
    public ResponseEntity<List<Movie>> findAllMovies() {
        List<Movie> ans = service.getmovies();
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @DeleteMapping("/delete_director_by_name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam("name") String directorname){
        service.deldirector(directorname);
        return new ResponseEntity("success",HttpStatus.OK);
    }
    @DeleteMapping("/delete_all_directors")
    public ResponseEntity<String> deleteAllDirectors(){
        service.deleteall();
        return new ResponseEntity("success",HttpStatus.OK);
    }
}
