package HW2_ex10;
import java.util.*;
public class Student extends Person
{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
            System.out.println("Please enter major: ");
            this.major=input.nextLine();
            System.out.println("Please enter gpa: ");
            this.gpa=input.nextDouble();
        }
    @Override
        public void display()
        {
    	super.display();
            System.out.println( "\n" + " Major: " + major +"\t"+ " GPA: " + gpa);
        }
}
