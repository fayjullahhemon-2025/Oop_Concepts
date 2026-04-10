package projects.Car_Showroom_Management;
import java.util.Scanner;
interface Utility{
    public void set_Details();
    public void get_Details();
}

public class Main {

    public static void main_menu(){
        System.out.println("--------------------**Welcome to Showroom Management System**--------------------");
        System.out.println("");
        System.out.println("--------------------**Enter Your choice**--------------------");
        System.out.println("");
        System.out.println("1) ADD SHOWROOMS \t\t\t 2)ADD EMPLOYEES \t\t\t 3) ADD CARS");
        System.out.println("");
        System.out.println("4) GET SHOWROOMS \t\t\t 5) GET EMPLOYEE \t\t\t 6) GET CARS");
        System.out.println("");
        System.out.println("--------------------**Enter 0 to exit**--------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int showroom_counter = 0;
        int employee_counter = 0;
        int car_counter = 0;
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Car car[] = new Car[5];
        int choice = 100;
        while(choice !=0){
            main_menu();
            choice = input.nextInt();
            while(choice !=0 && choice !=9){

                switch(choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_Details();
                        showroom_counter++;
                        System.out.println("1)Add More Showroom");
                        System.out.println("9)Back To Main Menu");
                        choice = input.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[employee_counter].set_Details();
                        employee_counter++;
                        System.out.println("2)Add More Employee");
                        System.out.println("9) Back TO Main Menu");
                        choice = input.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_Details();
                        car_counter++;
                        System.out.println("3)Add More Car");
                        System.out.println("9)Back To Main Menu");
                        choice = input.nextInt();
                        break;
                    case 4:
                        for(int i = 0; i<showroom_counter;i++){
                            showroom[i].get_Details();
                            System.out.println("");
                        }
                        System.out.println("9)Back To main menu");
                        System.out.println("0)Exit");
                        choice = input.nextInt();
                        break;
                    case 5:
                        for(int i = 0; i<employee_counter;i++){
                            employee[i].get_Details();
                            System.out.println("");
                        }
                        System.out.println("9)Back To main menu");
                        System.out.println("0)Exit");
                        choice = input.nextInt();
                        break;
                    case 6:
                        for(int i = 0; i<car_counter;i++){
                            car[i].get_Details();
                            System.out.println("");
                        }
                        System.out.println("9)Back To main menu");
                        System.out.println("0)Exit");
                        choice = input.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid input");
                        choice = input.nextInt();
                        break;

                }
            }
        }
    }
}
