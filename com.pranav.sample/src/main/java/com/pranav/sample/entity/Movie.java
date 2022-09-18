package com.pranav.sample.entity;

public class Movie {
	
	private int id;
	private String movieName;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + "]";
	}

	public Movie(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	

	
	

}
