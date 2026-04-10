package Classes_Objects.practices;

import java.awt.print.Book;

public class Book_3 {//constructor overloading
//    Write a Java program to create a class called "Book"
//    with instance variables title, author, and price. Implement
//    a default constructor and two parameterized constructors:

    //One constructor takes title and author as parameters.
    //The other constructor takes title, author, and price as parameters.
    //Print the values of the variables for each constructor.

    String title;
    String author;
    double price;

    Book_3(){
        title = "Java OOP";
        author = "Emon";
        price = 320.75;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Default constructor");
    }
    Book_3(String title, String author){
        this.title = title;
        this.author = author;
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Parameterized constructor 1");

    }
    Book_3(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Parameterized constructor 2");

    }

    public static void main(String[] args) {
        Book_3 b1 = new Book_3();

        Book_3 b2 = new Book_3("Java oop part 2", "Emon");
        Book_3 b3 = new Book_3("Java oop part 3", "Emon",350.75);
    }

}
