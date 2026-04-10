package Classes_Objects.practices;

public class Cat_1 {
//    Write a Java program to create a class called "Cat" with
//    instance variables name and age. Implement a default constructor
//    that initializes the name to "Unknown" and the age to 0. Print the
//    values of the variables.
    String name;
    int age;

    Cat_1(){
        this.name = "Unknown";
        this.age = 0;
        System.out.println(" Name: "+name +" Age: "+ age);
    }

    public static void main(String[] args) {
        Cat_1 c1 = new Cat_1();
    }
}
