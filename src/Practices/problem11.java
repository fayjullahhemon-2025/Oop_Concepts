package Practices;

import java.util.ArrayList;

//Write a Java program to create a class called "Library"
// with a collection of books and methods to add and remove books.
class Library{
    private ArrayList books;
    public Library(){
        books = new ArrayList();
    }
    public void addBooks(String book){
        books.add(book);
    }
    public void removeBook(String book){
        books.remove(book);
    }
    public ArrayList getBooks(){
        return books;
    }
}
public class problem11 {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.addBooks("ABC");
        l1.addBooks("DEF");
        l1.addBooks("GHI");
        for(Object b : l1.getBooks()){
            System.out.println(b);
        }
    }
}
