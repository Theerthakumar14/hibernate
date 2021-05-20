package com.xworkz.xworkzapp.dao;

import java.util.Set;

import com.xworkz.xworkzapp.dto.MovieDTO;

public interface MovieDAO {
	
	public void addMovieDetails(String movieName,MovieDTO dto);
	
	
	
	public Set updateMovieDetails(String hero,String movieName);
	
	public void display();
	
	public void deleteMovie(String director);

}
