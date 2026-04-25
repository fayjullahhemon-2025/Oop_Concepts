package Practices;
/**
// Write a Java program to create a class called "BankAccount"
// with attributes for account number, account holder's name, and balance.
// Include methods for depositing and withdrawing money,
// as well as checking the balance. Create a subclass called
// "SavingsAccount" that adds an interest rate attribute
// and a method to apply interest.
**/
class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private double depositMoney = 0;
    private double withdrawMoney = 0;
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setDepositMoney(double money){
        this.balance = this.balance + money;
    }

    public void setWithdrawMoney(double money){
        if(balance >=money){
            balance = balance - money;
        }else{
            System.out.println("You do not have sufficient Balence");
        }
    }
    public double checkBalance(){
        return balance;
    }


}
class SavingsAccount extends BankAccount{

    private double interestRate = 7 ;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    public void applyInterest(double interestRate){
        double balance = super.getBalance();
        balance = balance + balance*(interestRate/100);
        super.setBalance(balance);
    }
}
public class problem20 {
    public static void main(String[] args) {
        SavingsAccount user1 = new SavingsAccount(72,"Emon",25000);
        user1.applyInterest(7);
        System.out.println(user1.checkBalance());
        user1.setWithdrawMoney(1323);
        System.out.println("Remaining balance: "+user1.checkBalance());
    }

}
