/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handenur_agbulut_20070006069;

import java.util.ArrayList;
/**
 *
 * @author Handenur
 */
public class Movies {
    private static int movie = 1;
    private String title;
    private int year1;
    private int length1;
    private String genre1;
    private String StudioName;
    private double rating; 
    private final int id;
    private static int nextId = 1;

    public Movies() {
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

    public String getTitle() {
        return title;
    }

    public int getYear1() {
        return year1;
    }

    public int getLength1() {
        return length1;
    }

    public String getGenre1() {
        return genre1;
    }

    public String getStudioName() {
        return StudioName;
    }

    public double getRating() {
        return rating;
    }

    public static void setMovie(int movie) {
        Movies.movie = movie;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear1(int year1) {
        this.year1 = year1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public void setGenre1(String genre1) {
        this.genre1 = genre1;
    }

    public void setStudioName(String StudioName) {
        this.StudioName = StudioName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
