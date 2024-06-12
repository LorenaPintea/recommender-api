package io.datajek.springbootdemo.recommender_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {
    //method to return all movies
    //@RequestMapping(method = RequestMethod.GET, value = "/movies")
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1, "Ice Age", 7.5),
                new Movie(2, "Happy Feet", 6.4),
                new Movie(3, "Shark Tales", 6.0),
                new Movie(4, "Miami Bici 1", 5.6),
                new Movie(5, "Miami Bici 2", 5.1),
                new Movie(6, "Test DevTools", 9.5));
    }
}
