package com.murat.rest.springmongorestapi.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Movies {
	@Id
	public ObjectId id;
	
	public String name;

	public int year;
	
	public int duration;
	
	public String director;
	
	public List<String> genre;
	
	
	public Movies() {
	}


	public Movies(ObjectId id, String name, int year, int duration, String director, List<String> genre) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.duration = duration;
		this.director = director;
		this.genre = genre;
	}


	public ObjectId getId() {
		return id;
	}


	public void setId(ObjectId id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public List<String> getGenre() {
		return genre;
	}


	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	
	
	}

