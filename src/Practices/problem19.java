package Practices;
//Write a Java program to create a class with methods
// to search for flights and hotels, and to book and cancel reservations.
import java.security.spec.PSSParameterSpec;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.UUID;
class Flights{
    private int flightNumber;
    private String origin;
    private String destination;
    private LocalDate date;
    private LocalTime time;
    private int numPassengers;
    private double price;
    public Flights(String origin, String destination,LocalDate date,LocalTime time,double price, int numPassengers){
        this.flightNumber = RandomGenerator.getDefault().nextInt(1520, 65210);
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.price = price;
        this.numPassengers = numPassengers;
    }
    public int getFlightNumber(){
        return flightNumber;
    }
}
class Hotels{

}
class Passenger{
    private String name;
    private String id;

    private static ArrayList<TravelApp> reserveFlight;
    public Passenger(String name){
        this.name = name;
        UUID uid = UUID.randomUUID();
        this.id = String.valueOf(uid);

        reserveFlight = new ArrayList<TravelApp>();
    }
    public ArrayList<TravelApp> getBookFlight(){
        return reserveFlight;
    }

    public int reserveFlights(TravelApp rf){
        reserveFlight.add(rf);
        return RandomGenerator.getDefault().nextInt(100,5000);
    }
    public void getPassengerInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);

    }
    public String getName(){
        return name;
    }
}

class TravelApp{
    private int confirmationCode;
    private static ArrayList<Flights> flights;
    private static ArrayList<Hotels> hotels;
    public TravelApp(){
        flights = new ArrayList<Flights>();
        hotels = new ArrayList<Hotels>();
    }
    public int addFlight(Flights flight){
        flights.add(flight);
        confirmationCode = RandomGenerator.getDefault().nextInt(100,3000);
        return confirmationCode;
    }
    public void cancelReservation(Flights flight){
        flights.remove(flight);
    }
}
public class problem19 {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Emon");
        Flights f1 = new Flights("Dhaka","Chittagong",LocalDate.of(2026,4,24),LocalTime.now(),15000,3);
        TravelApp t1= new TravelApp();
        t1.addFlight(f1);
        System.out.println("Flight number: "+f1.getFlightNumber()+" is reseverd by"+p1.getName()+". The confirmation code is: "+p1.reserveFlights(t1));

        p1.getPassengerInfo();
    }
}
