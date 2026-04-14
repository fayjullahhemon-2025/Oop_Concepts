package Practices;
//Write a Java program to create a class called "Employee"
// with a name, job title, and salary attributes,
// and methods to calculate and update salary.
class Employee{
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle,double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public double raiseSalary(double parcentage){
        salary = salary + salary*parcentage/100;
        return salary;
    }
    public void getDetails(){
        System.out.println("Name: "+name);
        System.out.println("Job: "+jobTitle);
        System.out.println("Salary: "+salary);
    }
}
public class problem6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Emon","ABC",25);
        Employee emp2 = new Employee("Payel","DEF",20);
        emp1.getDetails();
        emp2.getDetails();
        emp1.raiseSalary(8);
        emp2.raiseSalary(12);
        System.out.println(emp1.getName()+"'s salary: " +emp1.getSalary());
        System.out.println(emp2.getName()+"'s salary: "+emp2.getSalary());
    }
}
