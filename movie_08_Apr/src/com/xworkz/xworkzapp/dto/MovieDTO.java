package com.xworkz.xworkzapp.dto;

public class MovieDTO {
	
	private String movieName;
	private String hero;
	private String director;
	private String producer;
	private int noOfSongs;
	
	public MovieDTO(String movieName, String hero, String director, String producer, int noOfSongs) {
		super();
		this.movieName = movieName;
		this.hero = hero;
		this.director = director;
		this.producer = producer;
		this.noOfSongs = noOfSongs;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getHero() {
		return hero;
	}

	public String getDirector() {
		return director;
	}

	public String getProducer() {
		return producer;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}
	
	
	

}
