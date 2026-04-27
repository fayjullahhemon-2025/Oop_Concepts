package Practices;
//Write a Java program to create a class called "CustomerOrder"
// with attributes for order ID, customer, and order date.
// Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number.
// Implement methods to calculate delivery time based on the address and update the tracking status.
class CustomerOrder{
    private String id;
    private String customer;
    private String date;
    public CustomerOrder(String id, String customer,String date){
        this.id = id;
        this.customer = customer;
        this.date = date;
    }
    public void customerOrderDetail(){
        System.out.println("Order ID: "+id);
        System.out.println("Customer name: "+customer);
        System.out.println("Order Date: "+date);
    }
}
class OnlineOrder extends CustomerOrder{
    private String deliveryAddress;
    private int trackingNumber;
    public OnlineOrder(String id, String customer, String date,String deliveryAddress,int trackingNumber){
        super(id,customer,date);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }


    public int deliveryTime(){
        int time = deliveryAddress.length() % 10 + 1;
        return time;
    }
    public void status(String c){
        System.out.println("Order Status: "+c);
    }
    @Override
    public void customerOrderDetail(){
        super.customerOrderDetail();
        System.out.println("Delivery address: "+deliveryAddress);
        System.out.println("Tracking Number: "+trackingNumber);
        System.out.println("Delivery Time: "+deliveryTime());
    }
}
public class problem27 {
    public static void main(String[] args) {
        OnlineOrder o1 = new OnlineOrder("Ae201m","Emon","27-04-2026","572 , Ideal point",231072);
        o1.customerOrderDetail();
        o1.status("In Transit");
    }
}
