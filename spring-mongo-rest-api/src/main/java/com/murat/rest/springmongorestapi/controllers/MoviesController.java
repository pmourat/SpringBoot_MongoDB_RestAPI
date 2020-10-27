package com.murat.rest.springmongorestapi.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.murat.rest.springmongorestapi.models.Movies;
import com.murat.rest.springmongorestapi.repositories.MoviesRepository;

@RestController
@RequestMapping("/movies")
public class MoviesController {
	
	@Autowired
	private MoviesRepository moviesRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Movies> getAllMovies() {
	    return moviesRepository.findAll();
	  }
	
	


	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Movies getMovieById(@PathVariable("id") ObjectId id) {
		  Movies mv = moviesRepository.findByid(id);
		  
		  return mv;
	  }
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public Movies modifyMovieById(@PathVariable("id") ObjectId id, @Validated @RequestBody Movies movies) {
	    movies.setId(id);
	    moviesRepository.save(movies);
	    
	    return movies;
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Movies createMovie(@Validated @RequestBody Movies movies) {
	    movies.setId(ObjectId.get());
	    moviesRepository.save(movies);
	    return movies;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public String deleteMovie(@PathVariable ObjectId id) {
	    moviesRepository.delete(moviesRepository.findByid(id));
	    return "Movie with id " + id + " was deleted ";
	  }

}
