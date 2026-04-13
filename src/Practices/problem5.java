package Practices;

import java.sql.Array;
import java.util.ArrayList;

//Write a Java program to create a class called "Book"
// with attributes for title, author, and ISBN, and methods
// to add and remove books from a collection.
class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();
    public Book(String title,String author, String ISBN){
        this.title= title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return ISBN;
    }
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }
    public static ArrayList<Book> getBookCollection(){
        return bookCollection;
    }

}
public class problem5 {
    public static void main(String[] args) {
        Book book1 = new Book("Abc","Emon","123");
        Book book2 = new Book("EDF","bukta","234");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        //System.out.println(Book.getBookCollection());
        for(Book book : bookCollection){
            System.out.println(book.getAuthor() + " " + book.getISBN() + " "+book.getTitle());
        }
    }
}
