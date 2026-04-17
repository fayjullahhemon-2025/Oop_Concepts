package Practices;

//Write a Java program to create a class called "Airplane"
// with a flight number, destination, and departure time attributes,
// and methods to check flight status and delay
import java.time.LocalTime;
class Airplan{
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private int delayTime;
    public Airplan(String flightNumber, String destination , LocalTime departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayTime = 0;
    }
    public void delay(int minutes){
        delayTime = delayTime +  minutes;
        this.departureTime = this.departureTime.plusMinutes(delayTime);
    }
    public void status(){
        if(delayTime>0){
            System.out.println("The flight: "+flightNumber+" is delayed by "+departureTime);
        }else{
            System.out.println("The flight: "+flightNumber+" is on time.");
        }

    }
}
public class problem12 {
    public static void main(String[] args) {
        Airplan airplan = new Airplan("BOAHANCOCK","Elbaf",LocalTime.of(10,30));
        airplan.delay(15);
        airplan.status();
    }
}
