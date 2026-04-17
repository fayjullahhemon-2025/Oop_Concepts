package Practices;
//Write a Java program to create a class called "Inventory"
// with a collection of products and methods to add and remove products,
// and to check for low inventory.
import java.util.ArrayList;
class Inventory{
    private static ArrayList products;
    private int minimumProduct = 5;

    public Inventory(){
        products = new ArrayList();
    }
    public void addProducts(String c){
        products.add(c);
    }
    public void removeProducts(String c){
        products.remove(c);
    }
    public void checkInventory(){
        if(products.toArray().length < minimumProduct){
            System.out.println("Low Inventory");
            System.out.println(products.toArray().length +" products left in inventory");
        }else{
            System.out.println(products.toArray().length +" products left in inventory");
        }
    }
    public static ArrayList getProducts(){
        return products;
    }
}
public class problem13 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProducts("Chips");
        inventory.addProducts("Cold Drink");
        inventory.addProducts("Icecream");
        inventory.addProducts("Juice");
        inventory.addProducts("Popcorn");
        for(Object c : Inventory.getProducts()){
            System.out.println(c);
        }
        inventory.removeProducts("Chips");
        inventory.removeProducts("Juice");
        for(Object c : Inventory.getProducts()){
            System.out.println(c);
        }
        inventory.checkInventory();
    }
}
