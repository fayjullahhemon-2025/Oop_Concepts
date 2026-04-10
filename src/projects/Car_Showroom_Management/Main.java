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
        while(true){
            main_menu();
            int choice = input.nextInt();
            if(choice==1){
                while(showroom_counter<5){
                    showroom[showroom_counter].set_Details();
                    System.out.println("1) Add more Showroom \t\t\t 9)Main menu");
                    choice = input.nextInt();
                    if(choice == 1){
                        showroom_counter++;
                    }else if(choice == 9){
                        break;
                    }else{
                        System.out.println("Enter Valid choice");
                        choice = input.nextInt();
                    }

                }

            }else if(choice == 2){
                while(employee_counter<5){

                    employee[employee_counter].set_Details();
                    System.out.println("1) Add Employee \t\t\t 9)Main menu");
                    choice = input.nextInt();
                    if(choice == 1){
                        employee_counter++;
                    }else if(choice == 9){
                        break;
                    }else{
                        System.out.println("Enter Valid choice");
                        choice = input.nextInt();
                    }

                }
            }else if(choice ==3){
                while(car_counter<5){

                    car[car_counter].set_Details();
                    System.out.println("1) Add Car \t\t\t 9)Main menu");
                    choice = input.nextInt();
                    if(choice == 1){
                        car_counter++;
                    }else if(choice == 9){
                        break;
                    }else{
                        System.out.println("Enter Valid choice");
                        choice = input.nextInt();
                    }

                }
            }else if(choice == 4){
                for(int i =0; i< showroom_counter;i++){
                    showroom[i].get_Details();
                }
                System.out.println("9) Main menu");
                choice = input.nextInt();
                if(choice ==9){
                    main_menu();
                }else{
                    System.out.println("Enter valid choice");
                    choice = input.nextInt();
                }
            }else if(choice == 5){
                for(int i =0; i< employee_counter;i++){
                    employee[i].get_Details();
                }
                System.out.println("9) Main menu");
                choice = input.nextInt();
                if(choice ==9){
                    main_menu();
                }else{
                    System.out.println("Enter valid choice");
                    choice = input.nextInt();
                }
            }else if(choice ==6){
                for(int i =0; i< car_counter;i++){
                    car[i].get_Details();
                }
                System.out.println("9) Main menu");
                choice = input.nextInt();
                if(choice ==9){
                    main_menu();
                }else{
                    System.out.println("Enter valid choice");
                    choice = input.nextInt();
                }
            }
        }
    }
}
