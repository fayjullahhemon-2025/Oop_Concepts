package Practices;

import java.awt.*;
import java.util.ArrayList;

//Write a Java program to create a class called "Restaurant"
// with attributes for menu items, prices, and ratings,
// and methods to add and remove items, and to calculate average rating.
class MenuItem{
    private String productName;
    private double price;
    private double ratings;
    public MenuItem(String productName, double price, double ratings){
        this.productName = productName;
        this.price = price;
        this.ratings = ratings;
    }
    @Override
    public String toString(){
        return "Name: "+productName +" | "+"Price: "+price  + " | "+"Rating: "+ratings;
    }
    public double getRatings(){
        return ratings;
    }

}
class Restaurant{

    public static ArrayList<MenuItem> menu;
    public Restaurant(){
        menu = new ArrayList<MenuItem>();
    }
    public void addItem(MenuItem item){
        menu.add(item);
    }
    public void removeItem(MenuItem item){
        menu.remove(item);
    }
    public ArrayList getMenu(){
        return menu;
    }
    public double avgRatings(){
        int flag=0;
        double total=0;
        for(MenuItem m : menu ){
            total = total + m.getRatings();
            flag++;
        }
        return total/flag;
    }

}
public class problem18 {
    public static void main(String[] args) {
        Restaurant YumCha = new Restaurant();
        MenuItem breakfast = new MenuItem("Rooti with Chicken curry",450,4.83);
        YumCha.addItem(breakfast);
        MenuItem lunch = new MenuItem("Dal vat with beef rejala",890,3.55);
        YumCha.addItem(lunch);
        MenuItem dinner = new MenuItem("Peshwari beef with garlic Nan",1015,2.5);
        YumCha.addItem(dinner);
        for(MenuItem m : Restaurant.menu){
            System.out.println(m);
        }
        System.out.println("Avg ratings:"+ YumCha.avgRatings());
    }
}
