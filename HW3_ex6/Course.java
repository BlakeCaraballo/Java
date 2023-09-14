package HW3_ex6;
public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    public Course() {
      department = "";
      courseNumber = 0;
      credits = 0;
    }
    public Course(String dept, int num, double creditValue) throws CourseException {
      boolean isBad = false;
      String msg1 = " Department name should be 3 letters";
      String msg2 = " Course number must be between 100 and 499";
      String msg3 = " Credits mut be between 0.5 and 6";
      department = dept;
      courseNumber = num;
      credits = creditValue;
      
      if(department.length() != DEPT_LENGTH) {
    	  isBad = true;
    	  if(isBad)
    		  throw(new CourseException("course #" + num + " was not created successfully due to" + msg1));
      }
      if((courseNumber < LOW_NUM) || (courseNumber > HIGH_NUM)) {
    	  isBad = true;
    	  if(isBad)
    		  throw(new CourseException("course #" + num + " was not created successfully due to" + msg2));
      }
      if((credits<LOW_CREDITS)||(credits>HIGH_CREDITS)) {
    	  isBad = true;
    	  if(isBad)
    		  throw(new CourseException("course #" + num + " was not created successfully due to" + msg3));
      }
      
    }
    public String getDepartment() {
		return department;
	}
	
	public int getCourseNumber() {
		return courseNumber;
	}
	
	public double getCredits() {
		return credits;
	}
	
	public String toString() {
        return " department: " + department+ "courseNumnber: "+courseNumber+" credits: "+credits;
    }
}
