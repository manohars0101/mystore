package Practicles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial of  a given number
		
		System.out.println("Please enter a number");
		Scanner s =new Scanner (System.in);
		int n= s.nextInt();
		int fact=1;
		if (n==0){
			System.out.println( "Factorial 0! = 1");
			}
		else{
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial  " + n + "!" + "= "+ fact);
		}
}
}
