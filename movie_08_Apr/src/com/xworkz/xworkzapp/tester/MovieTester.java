package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dao.MovieDAO;
import com.xworkz.xworkzapp.dao.MovieDAOImpl;
import com.xworkz.xworkzapp.dto.MovieDTO;

public class MovieTester {
	
	public static void main(String[] args) {
		
		MovieDTO dto=new MovieDTO("KGF","Yash","Neel","Vijay", 5);
		MovieDTO dto1=new MovieDTO("KGF2","Yash","Neel","Vijay", 8);
		MovieDTO dto2=new MovieDTO("Robert","Darshan","Tarun","Umapathi", 7);
		MovieDTO dto3=new MovieDTO("Victory","Sharan","Nandakishore","Xyz", 4);
		
		MovieDAO dao=new MovieDAOImpl();
		dao.addMovieDetails(dto.getMovieName(),dto);
		dao.addMovieDetails(dto1.getMovieName(),dto1);
		dao.addMovieDetails(dto2.getMovieName(),dto2);
		dao.addMovieDetails(dto3.getMovieName(),dto3);
       // dao.display();
        dao.updateMovieDetails("Sharan","Victory2");
          dao.display();
          dao.deleteMovie("Nandakishore");
          dao.display();
	}
	

}
