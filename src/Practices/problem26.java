package Practices;
//Write a Java program to create a class called "Event"
// with attributes for event name, date, and location.
// Create subclasses "Seminar" and "MusicalPerformance" that
// add specific attributes like number of speakers for seminars and performer list for concerts.
// Implement methods to display event details and check for conflicts in the event schedule.

import java.util.ArrayList;

class Event{
    private String name;
    private String date;
    private String location;

    public Event(String name, String date, String location){
        this.name = name;
        this.date = date;
        this.location = location;
    }
    public void displayEvent(){
        System.out.println("Name: "+name);
        System.out.println("Date: "+date);
        System.out.println("Location: "+location);
    }
    public boolean isConflictWith(Event e){
        if((this.date).equals(e.date) && (this.location).equals(e.location)){
            return true;
        }else{
            return false;
        }
    }
}
class Seminar extends Event{
    private ArrayList<String> speaker;
    public Seminar(String name, String date, String location){
        super(name,date,location);
        this.speaker = new ArrayList<>();
    }
    public void addSpeaker(String s){
        speaker.add(s);
    }
    public void speakerList(){
        for(String s : speaker){
            System.out.println(s);
        }
    }
    @Override
    public void displayEvent(){
        super.displayEvent();
        speakerList();
    }

}
class MusicalPerformance extends Event{
    private ArrayList<String> performers;
    public MusicalPerformance(String name, String date, String location){
        super(name,date,location);
        this.performers = new ArrayList<>();
    }
    public void addPerfomers(String p){
        performers.add(p);
    }
    public void getPerformers(){
        for(String s : performers){
            System.out.println(s);
        }
    }
    @Override
    public void displayEvent(){
        super.displayEvent();
        getPerformers();
    }
}
public class problem26 {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Space Conference", "29-04-2026", "Convention Center");
        seminar.addSpeaker("Emon");
        seminar.addSpeaker("Payel");
        seminar.addSpeaker("Moon");
        System.out.println("Speaker list:");
        seminar.displayEvent();

        MusicalPerformance concert = new MusicalPerformance("Winter Fest", "29-04-2026", "Convention Center");
        MusicalPerformance concert2 = new MusicalPerformance("Winter Fest", "30-04-2026", "Convention Center");

        concert.addPerfomers("Rattry");
        concert.addPerfomers("Afsar");
        concert.addPerfomers("Mawa");

        concert2.addPerfomers("Fahmida");
        concert2.addPerfomers("Sneha");
        concert2.addPerfomers("Jarin");

        System.out.println("Concert 1 details");
        concert.displayEvent();
        if(seminar.isConflictWith(concert)){
            System.out.println("The seminar is conflict wth concert at the same date and venue");
        }else{
            System.out.println("No Conflict");
        }
        System.out.println("Concert 2 details");
        concert2.displayEvent();

        if(seminar.isConflictWith(concert2)){
            System.out.println("The seminar is conflict wth concert at the same date and venue");
        }else{
            System.out.println("No Conflict");
        }

    }
}
