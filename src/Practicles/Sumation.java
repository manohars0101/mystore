package Practicles;

import java.util.Scanner;

public class Sumation {

	public static void main(String[] args) {

		// Program to print sum of numbers from 1 to n(n is a user entered number
		
		System.out.println("Please enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		for (int i=0; i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of " + n +"number is " + sum);
	}

}
