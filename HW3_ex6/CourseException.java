package HW3_ex6;
public class CourseException extends Exception {
	private String dept;
	private int courseNum;
	private double credits;
	
    public CourseException(String s) {
     super(s);

    }
}
