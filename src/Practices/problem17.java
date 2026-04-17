package Practices;

import java.util.ArrayList;

//Write a Java program to create a class called "Movie"
// with attributes for title, director, actors, and reviews,
// and methods for adding and retrieving reviews.
class Movie{
    private String title;
    private String director;
    private static ArrayList actors;
    private static ArrayList reviews;
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
        this.actors = new ArrayList();
        this.reviews = new ArrayList();
    }
    public void setActors(String name){
        actors.add(name);
    }
    public ArrayList getActors(){
        return actors;
    }
    public void setReviews(String review){
        reviews.add(review);
    }
    public ArrayList getReviews(){
        return reviews;
    }
}
public class problem17 {
    public static void main(String[] args) {
        Movie sitaree = new Movie("Sitaree","Emon");
        sitaree.setActors("Payel");
        sitaree.setActors("Moon");
        sitaree.setActors("Jihad");
        sitaree.setActors("Afsar");
        sitaree.setActors("Rattry");
        sitaree.setReviews("Faltu ekta movie");
        sitaree.setReviews("Rattry overacting kore");
        sitaree.setReviews("You fucking liar, moons speech hits personally");
        sitaree.setReviews("Payel sudhu jihad er theika treat khay. or main kaj ki eine?");
        sitaree.setReviews("Afsar eto meyeder approoach kre kemne?");
        sitaree.setReviews("Jihad er kaj ki sudhu treat deya ar moon er sathe jogra kra?");
        sitaree.setReviews("Movie er name er sathe story er kno mil nai");
        for(Object actorList: sitaree.getActors()){
            System.out.println(actorList);
        }
        for(Object reviewList: sitaree.getReviews()){
            System.out.println(reviewList);
        }
    }
}
