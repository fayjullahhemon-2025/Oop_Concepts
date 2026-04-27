package Practices;
//Write a Java program to create a class called "ElectronicsProduct"
// with attributes for product ID, name, and price.
// Implement methods to apply a discount and calculate the final price.
// Create a subclass " WashingMachine" that adds a warranty period attribute and
// a method to extend the warranty.
class ElectronicsProduct{
    private String productId;
    private String name;
    private double price;

    public ElectronicsProduct(String productId,String name,double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public double finalPriceAfterDiscount(double d){
        price = price - price*(d/100);
        return price;
    }

}
class WashingMachine extends ElectronicsProduct{
    double warrantyPeriod;
    public WashingMachine(String productId,String name,double price,double warrantyPeriod ){
        super(productId,name,price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public void extendWarrantyPeriod(double year){
        System.out.println("Warranty before extend: "+warrantyPeriod);
        warrantyPeriod = warrantyPeriod+year;
        System.out.println("Warranty After extend period: "+warrantyPeriod);
    }
    public void info(){
        System.out.println("Product Id: "+getProductId());
        System.out.println("Product name: "+getName());
        System.out.println("Product price: "+getPrice());
        System.out.println("Warranty Period: "+getWarrantyPeriod()+" Years");

    }
}
public class problem24 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("32AOqa","Walpur",60000,3);
        washingMachine.info();
        washingMachine.extendWarrantyPeriod(0.5);
        washingMachine.info();
    }
}
