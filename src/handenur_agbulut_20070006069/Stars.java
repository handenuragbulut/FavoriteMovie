/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handenur_agbulut_20070006069;

import static handenur_agbulut_20070006069.Movies.getNextId;

/**
 *
 * @author Handenur
 */
public class Stars {
    private static int movie = 1;
    private String movieTitle;
    private static int movieYear;
    private String NameSurname;
    private final int id;
    private static int nextId = 1;
    
    public Stars() {
        id = getNextId();
    }
    
    public int getId() {
        return id;
    }
    
    public static int getNextId(){
    int id = nextId;
    nextId++;
    return id;
    }

    public static int getMovie() {
        return movie;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public static int getMovieYear() {
        return movieYear;
    }

    public String getNameSurname() {
        return NameSurname;
    }

    public static void setMovie(int movie) {
        Stars.movie = movie;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public static void setMovieYear(int movieYear) {
        Stars.movieYear = movieYear;
    }

    public void setNameSurname(String NameSurname) {
        this.NameSurname = NameSurname;
    }   
}
