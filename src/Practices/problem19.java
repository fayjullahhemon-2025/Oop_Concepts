package Practices;
//Write a Java program to create a class with methods
// to search for flights and hotels, and to book and cancel reservations.

import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;
class Flights{
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
    private double price;
    private int confirmationNumber;
    private ArrayList flights;
    public Flights(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price){

        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
        this.flights = new ArrayList<>();
    }
    public int reserveFlight(String passengerName){
        flights.add(passengerName);
        confirmationNumber = RandomGenerator.getDefault().nextInt(100000,999999);
        return confirmationNumber;
    }
    public ArrayList getFlightsPassengers(){
        return flights;
    }
    public void cancelFlight(int confirmationNumber,String passengerName){
        if(this.confirmationNumber == confirmationNumber){
            flights.remove(passengerName);
            System.out.println("Flight cancel Successfully");
        }else{
            System.out.println("Wrong confirmation code");
        }
    }
}
class Hotel{
    private int HotelNumber;
    private String guestName;
    private String date;
    private int numOfGuest;
    private double price;
    private int confirmationNumber;
    private ArrayList hotels;
    public Hotel(int HotelNumber, String guestName, String date, int numOfGuest, double price){

        this.HotelNumber = HotelNumber;
        this.guestName = guestName;
        this.date = date;
        this.numOfGuest = numOfGuest;
        this.price = price;
        this.hotels = new ArrayList<>();
    }
    public int reserveHotelRoom(String guestName){
        hotels.add(guestName);
        confirmationNumber = RandomGenerator.getDefault().nextInt(100000,999999);
        return confirmationNumber;
    }
    public ArrayList getHotelGues(){
        return hotels;
    }
    public void cancelHotelRoom(int confirmationNumber,String guestName){
        if(this.confirmationNumber == confirmationNumber){
            hotels.remove(guestName);
            System.out.println("Room cancel Successfully");
        }else{
            System.out.println("Wrong confirmation code");
        }
    }
}
public class problem19 {
    public static void main(String[] args) {
        Flights f1 = new Flights(3210,"Null","Dhaka","Chittagong","24-04-2024",3,3200);
        f1.reserveFlight("Emon");
        f1.reserveFlight("Payel");
        int c = f1.reserveFlight("Moon");
        for(Object f : f1.getFlightsPassengers()){
            System.out.println(f);
        }

        f1.cancelFlight(c,"Moon");
        for(Object f : f1.getFlightsPassengers()){
            System.out.println(f);
        }
        Hotel h1 = new Hotel(2101,"Null","24-04-2026",3,5800);
        h1.reserveHotelRoom("Emon");
        h1.reserveHotelRoom("Payel");
        c = h1.reserveHotelRoom("Moon");
        for(Object h : h1.getHotelGues()){
            System.out.println(h);
        }
        h1.cancelHotelRoom(c,"Moon");
        for(Object h : h1.getHotelGues()){
            System.out.println(h);
        }
    }
}
