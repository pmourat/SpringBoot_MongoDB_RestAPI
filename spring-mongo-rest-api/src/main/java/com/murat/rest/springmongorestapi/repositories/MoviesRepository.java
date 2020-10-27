package com.murat.rest.springmongorestapi.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.murat.rest.springmongorestapi.models.Movies;

public interface MoviesRepository extends MongoRepository<Movies, String> {



	
	Movies findByid (ObjectId id);

}
