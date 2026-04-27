package Practices;
//Write a Java program to create a class called "Building"
// with attributes for address, number of floors, and total area.
// Create subclasses "ResidentialBuilding" and "CommercialBuilding"
// that add specific attributes like number of apartments for residential
// and office space for commercial buildings. Implement a method to calculate the total rent
// for each subclass.
interface rent{
    public void calculateTotalRent();
    public void displayInfo();
}
class Building{
    private String address;
    private int numberOfFloors;
    private double totalArea;

    public Building(String address, int numberOfFloors, double totalArea){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }
}
class ResidentialBuilding extends Building implements rent{

    private int numberOfApartments;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloors, double totalArea,int numberOfApartments,double rentPerApartment){
        super(address,numberOfFloors,totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }
    @Override
    public void calculateTotalRent(){
        double rent =  numberOfApartments*rentPerApartment;
        System.out.println("Total Rent: "+rent);
    }
    @Override
    public void displayInfo(){
        System.out.println("Address: "+getAddress());
        System.out.println("Number Of Floors: "+getNumberOfFloors());
        System.out.println("Total Area: "+getTotalArea());
        System.out.println("Number Of Apartments: "+numberOfApartments);
        System.out.println("Rent per Apartment: "+rentPerApartment);
        calculateTotalRent();

    }

}
class CommercialBuilding extends Building implements rent{
    private int officeSpace;
    private double rentPerSquareMeter;
    public CommercialBuilding(String address, int numberOfFloors, double totalArea,int officeSpace,double rentPerSquareMeter){
        super(address,numberOfFloors,totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }
    @Override
    public void calculateTotalRent(){
        double rent = officeSpace*rentPerSquareMeter;
        System.out.println("Total Rent: "+rent);
    }
    @Override
    public void displayInfo(){
        System.out.println("Address: "+getAddress());
        System.out.println("Number Of Floors: "+getNumberOfFloors());
        System.out.println("Total Area: "+getTotalArea());
        System.out.println("Office space: "+officeSpace);
        System.out.println("Rent per Square Meter: "+rentPerSquareMeter);
        calculateTotalRent();

    }
}
public class problem25 {
    public static void main(String[] args) {
        ResidentialBuilding b1 = new ResidentialBuilding("29/C East Nayatola",14,1250.75,7,25000);
        CommercialBuilding c1 = new CommercialBuilding("30/B/2 East Nayatola",14,1250.75,7,45000);
        b1.displayInfo();
        c1.displayInfo();
    }
}
