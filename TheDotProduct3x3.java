package csc;

public class TheDotProduct3x3 {
	public static void main(String[] args) {
		int[][] my2D_1={{1,3},{4,6},{15,16}};
		System.out.println("Original Vector: ");
		PrintVect2D(my2D_1);

		int rows= my2D_1.length;
		int cols= my2D_1[0].length;
		int[][] my2D_2 = new int[cols][rows];
		my2D_2=Transpose2D(my2D_1);
			
		System.out.println("\nTransposed Vector: ");
		PrintVect2D(my2D_2);
		System.out.println("\nDot Product of two Vectors: ");
		DotProd(my2D_1,my2D_2);
	}
	public static int[][] Transpose2D(int[][] x_arr) {
		int cols=x_arr[0].length;
		int rows=x_arr.length;
		int trans_arr[][] = new int[cols][rows];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				trans_arr[j][i]=x_arr[i][j];
			}
		}
		return (trans_arr);
	}
		
	
	public static void DotProd(int[][] x, int[][] y) {//multiplying a 3x2 and 2x3 makes a 3x3 matrix 
		int sum=0;									//with values 10 22 63
		int[][] my2D_1={{1,3},						//            22 52 156
						{4,6},						//            63 156 481
						{15,16}};
		int[][] my2D_2=Transpose2D(my2D_1);
		int[][] mult = new int[3][3];
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				for(int k =0;k<2;k++) {
					
					sum = sum+ my2D_1[i][k]*my2D_2[k][j];
				}
				mult[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mult[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	public static void PrintVect2D(int[][] vect) {
		System.out.print("{ ");
		for(int i=0; i<vect.length; i++) {
			if(i>0)
				System.out.print("  ");
			for(int j=0; j<vect[0].length; j++) {
				if(j<vect[0].length-1)
					System.out.print(vect[i][j]+", ");
				else
					System.out.print(vect[i][j]);
			}
			if(i<vect.length-1)
				System.out.println("");
			else
				System.out.println(" }");
		}
	}
}

