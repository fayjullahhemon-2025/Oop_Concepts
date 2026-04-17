package Practices;
//Write a Java program to create a class called "Shape"
// with abstract methods for calculating area and perimeter,
// and subclasses for "Rectangle", "Circle", and "Triangle".

abstract class Shape{
    public abstract void calcArea();
    public abstract void calcPerimeter();

}
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void calcArea(){
        System.out.println("Area of Rectangle is: "+(width*height));
    }
    @Override
    public void calcPerimeter(){
        System.out.println("Perimeter of Rectangle: "+(2*(width+height)));
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calcArea(){
        System.out.println("The area of Circle: "+(radius*radius));
    }
    @Override
    public void calcPerimeter(){
        System.out.println("The perimeter is: "+(2*3.14*radius));
    }
}
class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void calcArea(){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of Triangle is: "+area);
    }
    @Override
    public void calcPerimeter(){
        System.out.println("The perimeter of Triangle is: "+(a+b+c));
    }
}
public class problem16 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(24,10);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        Circle circle = new Circle(5);
        circle.calcArea();
        circle.calcPerimeter();
        Triangle triangle = new Triangle(5,12,14);
        triangle.calcArea();
        triangle.calcPerimeter();
    }
}
