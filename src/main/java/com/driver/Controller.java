package com.driver;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Functionality service;

    @PostMapping("/addMovie")
    public ResponseEntity<String> addmovie(@RequestBody() Movie movie) {
        service.addMovie(movie);
        return new ResponseEntity("Added success", HttpStatus.OK);
    }

    @PostMapping("/addDirector")
    public ResponseEntity<String> adddirector(@RequestBody() Director director) {
        service.addDirector(director);
        return new ResponseEntity("Success", HttpStatus.OK);
    }

    @PutMapping("/addMovieDirectorPair")
    public ResponseEntity<String> addpair(@RequestBody() RequestDTO dto) {
        service.addpair(dto);
        return new ResponseEntity("success", HttpStatus.OK);
    }

    @GetMapping("/getMovieByName")
    public ResponseEntity<Movie> getmovie(@RequestParam("name") String moviename) {
        Movie ans = service.getmovie(moviename);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/getDirectorByName")
    public ResponseEntity<Director> getdirector(@RequestParam("name") String directorname) {
        Director ans = service.getdirector(directorname);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/getMoviesByDirectorName")
    public ResponseEntity<List<String>> getlist(@RequestParam("name") String directorname) {
        List<String> ans = service.getList(directorname);
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/findAllMovies")
    public ResponseEntity<List<Movie>> findallmovie() {
        List<Movie> ans = service.getmovies();
        return new ResponseEntity(ans, HttpStatus.OK);
    }

    @GetMapping("/deleteDirectorByName")
    public ResponseEntity<String> deldir(@RequestParam("name") String directorname){
        service.deldirector(directorname);
        return new ResponseEntity("success",HttpStatus.OK);
    }
    @GetMapping("/deleteAllDirectors")
    public ResponseEntity<String> delall(){
        service.deleteall();
        return new ResponseEntity("success",HttpStatus.OK);
    }
}
