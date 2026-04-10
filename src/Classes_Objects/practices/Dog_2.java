package Classes_Objects.practices;

public class Dog_2 {
//    Write a Java program to create a class called Dog
//    with instance variables name and color. Implement
//    a parameterized constructor that takes name and color
//    as parameters and initializes the instance variables.
//    Print the values of the variables.

    String name;
    String color;

    Dog_2(String name,String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog_2 d1 = new Dog_2("Sneha","brown");
        System.out.println("Dog name: "+d1.name);
        System.out.println("Dog color: "+d1.color);
    }
}

