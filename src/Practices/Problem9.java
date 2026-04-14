package Practices;
//Write a Java program to create a class called "Employee"
// with a name, salary, and hire date attributes, and
// a method to calculate years of service.
import java.time.LocalDate;
import java.time.Period;
class Employee2{
        private String name;
        private double salary;
        private LocalDate hireDate;
        public Employee2(String name, double salary, LocalDate hireDate){
              this.name = name;
              this.salary = salary;
              this.hireDate = hireDate;
        }
        public int yearsOfService(){
            return Period.between(hireDate,LocalDate.now()).getYears();
        }

}
public class Problem9 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Emon",2500,LocalDate.parse("2020-06-24"));
        System.out.println("Years of Service: "+emp1.yearsOfService());
    }


}
