package HW2_lab3;

public class testRectangle  {
	

public static void main(String[] args) {
	rectangle R1 = new rectangle();
	rectangle R2 = new rectangle();	
	R1.setX(2.5);
	R1.setY(13.0);
	R1.setHeight(14.0);
	R1.setWidth(4.0);
	//System.out.println(R1+" Area is: "+R1.area());
	R2.setX(1.5);
	R2.setY(5.0);
	R2.setHeight(6.0);
	R2.setWidth(3.0);
	System.out.println(R2+" Area is: "+R2.area());
	isOverlap(R1,R2);

	

}

public static boolean isOverlap(rectangle R1, rectangle R2) {
	double topRightxR1 = R1.getX()+R1.getWidth();
	double topRightxR2 = R2.getX()+R2.getWidth();
	double topRightyR1 = R1.getY()+R1.getHeight();
	double topRightyR2 = R2.getY()+R2.getHeight();
	
	if(R1.getX()<topRightxR2 && R1.getY()<topRightyR2 && R2.getX()<topRightxR1 && R2.getY()<topRightyR1) {
		System.out.print("The rectangles do overlap");
		return true;
		}	
	else {
		System.out.print("The rectangles do not overlap");
		return false;
	}
	
	
}
}