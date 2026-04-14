package Practices;
//Write a Java program to create class called "TrafficLight"
// with attributes for color and duration, and methods to change the color
// and check for red or green.
class TrafficLight{
    private String color;
    private int duration;
    public TrafficLight(String color , int duration){
        this.color = color;
        this.duration = duration;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public String getColor(){
        return color;
    }
    public int getDuration(){
        return duration;
    }
    public void changeTrafficLight(String color){
        this.color = color;
    }
    public boolean isRed(){
        if((color).equals("red")){
            return true;
        }else{
            return false;
        }
    }
    public boolean isGreen(){
        if(color.equals("green")){
            return true;
        }else{
            return false;
        }
    }
    public boolean isYellow( ){
        if(color.equals("yellow")){
            return true;
        }else{
            return false;
        }
    }
}
public class problem8 {
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight("yellow",10);
        System.out.println(tf.isRed());
        System.out.println(tf.isGreen());
        System.out.println(tf.isYellow());
        tf.changeTrafficLight("red");
        System.out.println(tf.isRed());
        System.out.println(tf.getDuration());
        tf.setDuration(15);
        System.out.println(tf.getDuration());


    }
}
