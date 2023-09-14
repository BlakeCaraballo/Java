package HW2_ex10;
import java.util.*;
public class Faculty extends CollegeEmployee
{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
        public void setData()
        {
            super.setData();
           
            System.out.println("Is this faculty member tenured?: (true or false) ");
           this.isTenured=input.nextBoolean();
        }
    @Override
        public void display()
        {
            if(isTenured) {
            	super.display();
            	System.out.println("Faculty member is tenured");
            }
            else {
            	super.display();
            	System.out.println("Faculty member is not tenured");
            }
        }
}
