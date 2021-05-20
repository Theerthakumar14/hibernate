package com.xworkz.xworkzapp.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.xworkzapp.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {
	Map<String ,MovieDTO> movie = new HashMap<String ,MovieDTO>();

	public MovieDAOImpl()
	{
		MovieDTO dto=new MovieDTO("KGF","Yash","Neel","Vijay", 5);
		MovieDTO dto1=new MovieDTO("KGF2","Yash","Neel","Vijay", 8);
		MovieDTO dto2=new MovieDTO("Robert","Darshan","Tarun","Umapathi", 7);
		MovieDTO dto3=new MovieDTO("Victory","Sharan","Nandakishore","Xyz", 4);
		
	}
	@Override
	public void addMovieDetails(String movieName, MovieDTO dto) {
		movie.put(movieName, dto);
		System.out.println("movie added successfully");
	}

	@Override
	public  Set updateMovieDetails(String hero, String movieName) {
		
		       Set<Entry<String, MovieDTO>> s=movie.entrySet();
		             for (Entry<String, MovieDTO> entry : s) {
		            	 MovieDTO mdto	=entry.getValue();
		            	 if(mdto.getHero().equals(hero))
		            	 {
		            		 System.out.println("from update method");
		            		 mdto.setMovieName(movieName);
					}
		}
			return s;
	}

	@Override
	public void display() {
		Set<Entry<String, MovieDTO>> s=movie.entrySet();
        for (Entry<String, MovieDTO> entry : s) {
       	 MovieDTO mdto	=entry.getValue();
       	 System.out.println("**************************");
       	 System.out.println("The Moviename is"+" "+mdto.getMovieName());
       	System.out.println("The Moviehero is"+" "+mdto.getHero());
       	System.out.println("The Moviedirector is"+" "+mdto.getDirector());
       	System.out.println("The Movieproduce is"+" "+mdto.getProducer());
       	System.out.println("The Movie no of songs is"+" "+mdto.getNoOfSongs());
        System.out.println("**************************");
        }
	}

	public void deleteMovie(String director) {
		System.out.println("?????????");
		Set<Entry<String, MovieDTO>> s=movie.entrySet();
        for (Entry<String, MovieDTO> entry : s) {
       	 MovieDTO mdto	=entry.getValue();
		movie.remove(director);

}
	}
}