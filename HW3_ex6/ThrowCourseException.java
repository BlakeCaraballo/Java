package HW3_ex6;
public class ThrowCourseException {
    public static void main(String[] args) {
        int numRecords=6;
        Course[] courses = new Course[numRecords];
        String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CSC", "CSC"};
        int[] courseNums = {110, 200, 100, 700, 4351, 3350};
        double[] credits ={3, 4, 7.5, 0, 100, 2.5};
        for(int i = 0;  i <numRecords; i++) {
           courses[i] = new Course();
       }
    int x;
    for(x = 0; x< numRecords; x++) 
    	courses[x]= new Course();
    
    for(x=0;x<courses.length;x++)
    	try
    {
    		courses[x] = new Course(depts[x], courseNums[x],credits[x]);
    		System.out.println("Course"+courses[x]+" was created successfully");
    	}
    catch(CourseException error) {
    	System.out.println(error.getMessage());
    }
   
    }
}
    
