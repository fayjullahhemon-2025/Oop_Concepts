package Practices;
//Write a Java program to create a class called "Customer"
// with attributes for name, email, and purchase history.
// Implement methods to add purchases to the history and calculate total expenditure.
// Create a subclass "LoyalCustomer" that adds a discount rate attribute and
// a method to apply the discount.

import java.util.ArrayList;

class Customer{
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;
    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addPurchase(double price){
        purchaseHistory.add(price);
    }
    public double calculateExpenditure(){
        double total = 0;
        for(double t : purchaseHistory){
            total = total+t;
        }
        return total;
    }
    public void getPurchaseHistory(){
        for(double ph : purchaseHistory){
            System.out.println(ph);
        }
    }
}
class LoyalCustomer extends Customer{
    double discount;
    public LoyalCustomer(String name, String email, double discount){
        super(name,email);
        this.discount = discount;
    }
    public void applyDiscount(){
        double total = super.calculateExpenditure();
        total = total - total*(discount/100);
        System.out.println("Price after discount: "+total);

    }
}
public class problem22 {
    public static void main(String[] args) {
        LoyalCustomer lc = new LoyalCustomer("Emon","emon@gmail.com",25);
        lc.addPurchase(230);
        lc.addPurchase(334);
        lc.addPurchase(481);
        System.out.println("Total price:"+lc.calculateExpenditure());
        lc.getPurchaseHistory();
        lc.applyDiscount();
    }
}
