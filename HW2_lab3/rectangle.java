package HW2_lab3;

public class rectangle  {

	
			private double x; 
			private double y;
		    private double height; 
		    private double width;
	
		    public void Rectangle(double newx, double newy, double newwidth, double newheight) {
		        x = newx;
		        y = newy;
		        width = newwidth;
		        height = newheight;
		    
		    }
		    public void setX(double x1) {
		    	if(x1>0) {
		    	x = x1;
		    	}
		    	else {
		    		System.out.println("Invalid height: "+x1);
		    	}
		    }
		    public double getX() {
		        return x;
		    }
		    public void setY(double y1) {
		    	if(y1>0) {
		    	y = y1;
		    	}
		    	else {
		    		System.out.println("Invalid height: "+y1);
		    	}
		    }
		    public double getY() {
		        return y;
		    }
		    
		    public void setHeight(double ht) {
		    	if(ht>0) {
		    	height = ht;
		    	}
		    	else {
		    		System.out.println("Invalid height: "+ht);
		    	}
		    }
		    
		    public double getHeight() {
		        return height;
		    }
		    
		    public void setWidth(double wt) {
		    	if(wt>0) {
		    	width = wt;
		    	}
		    	else {
		    		System.out.println("Invalid height: "+wt);
		    	}
		    }
		    
		    public double getWidth() {
		        return width;
		    }

		    @Override
		    public String toString() {
		        return "Rectangle [x= " + x + ", y= " + y + ", height= " + height + ", width = " + width + "]";
		    }

		    public double area() {
		        return height * width;
		    }

}


