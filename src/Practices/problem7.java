package Practices;
//Write a Java program to create a class called "Bank"
// with a collection of accounts and methods to add and remove accounts,
// and to deposit and withdraw money. Also define a class called "Account"
// to maintain account details of a particular customer.
import java.util.UUID;
import java.util.ArrayList;
class Account{
    private String name;
    private String uid;
    private int accountNumber;
    private double balance;

    public Account(String name,int accountNumber, double balance){
        UUID uuid = UUID.randomUUID();
        uid = String.valueOf(uuid);
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double balance){
        this.balance = this.balance+balance;
    }
    public void withdraw(double balance){
        if(this.balance<balance){
            System.out.println("You do not have sufficient balance");
        }else{
            this.balance = this.balance - balance;
            System.out.println("You have withdrawn "+ balance + " TK");
            System.out.println("You remaining balance is "+this.balance);
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getUid(){
        return uid;
    }

}
class Bank{
    private static ArrayList<Account> account ;
    public Bank(){
        account =new ArrayList<Account>();
    }
    public void addAccount(Account acc){
        account.add(acc);
    }
    public void removeAccount(Account acc){
        account.remove(acc);
    }
    public ArrayList<Account> getAccounts(){
        return account;
    }
}
public class problem7 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new Account("Emon",72,4300.75);
        Account acc2 = new Account("Nowshin",73,5900.25);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        for(Account bankAccountList : bank.getAccounts() ){
            System.out.println("Name: "+bankAccountList.getName()+". user id: "+bankAccountList.getUid() + " balance: "+bankAccountList.getBalance());
        }
    }
}
