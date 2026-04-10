package projects.Car_Showroom_Management;
import java.util.Scanner;
import java.util.UUID;
public class Employee extends Showroom implements Utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_Details(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_department);
    }

    @Override
    public void set_Details(){
        System.out.println("--------------------**Enter Employee Details**--------------------");
        Scanner input = new Scanner(System.in);
        UUID uid = UUID.randomUUID();
        emp_id = String.valueOf(uid);
        System.out.print("Name: ");
        emp_name = input.nextLine();
        System.out.print("");
        System.out.print("Age: ");
        emp_age = input.nextInt();
        System.out.print("");
        input.nextLine();
        System.out.print("Department: ");
        emp_department = input.nextLine();
        System.out.print("");

    }
}
