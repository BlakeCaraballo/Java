package csc;

public class PrintDMatrices {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{4,5,6}
					};
		int [][] b = {
				{7,8},
				{9,10},
				{11,12}
					};
		int rows = 2;
		int cols = 2;
		int colsm1 = 3;
		int sum = 0;
		int[][] c = new int[2][2];
		
		for(int i = 0; i<rows;i++) 
		{
			for(int j = 0; j<cols; j++) 
			{
				for(int k = 0; k<colsm1;k++) 
				{
					sum+= a[i][k]*b[k][j];
				}
					c[i][j] = sum;
			}
		}
		
		for(int i = 0; i<rows;i++) 
		{
			for(int j = 0; j<cols;j++) 
			{
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
