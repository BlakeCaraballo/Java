package HW2_ex10;
import java.util.*;
public class CollegeEmployee extends Person
{   
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            System.out.println("Please enter SSN: ");
            this.ssn = input.nextLine();
            System.out.println("Please enter annual salary: ");
            this.annualSalary=input.nextDouble();
            System.out.println("Please enter department: ");
            this.dept=input.next();
        }
    @Override
        public void display()
        {
    	 super.display(); 
    	  System.out.println("\n" + "SSN: " + ssn + " Salary: $" + annualSalary + " Department: " + dept);
        }
}
