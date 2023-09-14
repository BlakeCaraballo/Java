package csc;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] someNums = {5,4,3,2,1};
		int comparisonsToMake = someNums.length-1; // controls how many comparisons are made
		int temp;
		int b;
		int a;
	
		//Ascending bubble sort algorithm, if the first number is bigger than the second, swap them.
		//To make it descending, change the if statement to a <
		
		for(a=0; a<comparisonsToMake;a++) {
			for(b=0;b < comparisonsToMake;b++) 	//run the sort length-1, in this case 4 times.
			if(someNums[b] > someNums[b+1]) { 	//if the first is > the second, swap them.
				temp = someNums[b];				//how to swap them
				someNums[b]=someNums[b+1];
				someNums[b+1]=temp;
				System.out.println(Arrays.toString(someNums)); //check how many times it has run
			}
		}
		comparisonsToMake--;                   	//decrement after each pass
		
		//System.out.println(Arrays.toString(someNums)); 		//check final output
		
		
		
		
	}

}
