package Practicles;

import java.util.Scanner;

public class MaxMinAvg {

	public static void main(String[] args) {
			// Program to find out maximum, minimum and average of numbers in an array.
		 System.out.println("Please enter number");
		 Scanner s = new Scanner (System.in);
		 int n = s.nextInt();
		 int numbers [] = new int [n];
		 System.out.println("Please enter elements");
		 for (int i=0;i<n;i++) {
			 numbers [i] = s.nextInt();
		 }
		 //Calling functions
		System.out.println(Maximum (numbers)); 
		System.out.println(Minimum (numbers));
		System.out.println(Average (numbers));

}
	// Maximum function
	public static int Maximum (int array []) {
		int max = array[0];
		for (int i=0;i<=array.length;i++) {
			if (max<array[i]) {
				max = array[i];
				}
			}
		return max;
	}
		// Minimum Function
	public static int Minimum (int array []) {
		int min = array[0];
		for (int i=0;i<=array.length;i++) {
			if (min>array[i]) {
				min = array[i];
				}
			}
		return min;
	}
	
	//Finding the average of numbers in an array
	public static int Average(int array []) {
		int sum=0;
		int avg;
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg= sum/array.length;
		return avg;		
	}
}