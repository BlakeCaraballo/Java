package HW2_ex10;
import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
       
        
        System.out.println("Please enter first name: ");
        this.firstName=input.nextLine();
        System.out.println("Please enter last name: ");
        this.lastName=input.nextLine();
        System.out.println("Please enter address: ");
        this.address=input.nextLine();
        System.out.println("Please enter zip code: ");
        this.zip=input.nextLine();
        System.out.println("Please enter phone number: ");
        this.phone=input.nextLine();
    }
    public void display()
    {
    	System.out.println("First name: "+firstName + " " +"Last name: "+ lastName + " "+"Address: " + address + " "+"Zip: " + zip + " "+"Phone number: "+ phone); 
    	
    }
}
