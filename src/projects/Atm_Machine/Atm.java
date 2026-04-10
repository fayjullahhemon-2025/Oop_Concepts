package projects.Atm_Machine;
import java.util.Scanner;
public class Atm {
    int pin=221072;
    int bal=3200;
    Scanner input = new Scanner(System.in);
    Atm(int userPin){
        if(userPin == pin){
            menu();
        }else{
            System.out.println("Wrong credential");
        }

    }

    public void menu(){
        System.out.println("1.Check balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        int opt = input.nextInt();
        if(opt==1){
            CheckBal();
            menu();
        }else if(opt == 2){
            WithdrawBal();
            menu();
        }else if(opt == 3){
            DepositMoney();
            menu();
        }else
            return;

    }
    public void CheckBal(){
        System.out.println("Your account balence is: "+bal +" TK");
    }
    public void WithdrawBal(){
        int withdrawalMoney = input.nextInt();
        if(withdrawalMoney<=bal){
            bal = bal - withdrawalMoney;
        }
        else{
            System.out.println("You do not have requested balance in your ATM");
        }
    }
    public void DepositMoney(){
        int deposit = input.nextInt();
        bal = bal + deposit;
    }

    public static void main(String[] args) {
        Atm atm1 = new Atm(221072);

    }
}
