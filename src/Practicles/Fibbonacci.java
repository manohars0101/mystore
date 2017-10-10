package Practicles;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		//Fibonacci number of given number
		// for number n fibonacci number is sum of n-1 and n-2
		
		System.out.println("Please enter number to find out its fibonacci number and fibonacci series upto it");
		Scanner s1= new Scanner (System.in);
		int n= s1.nextInt();
	//	System.out.println(fibo_num(n));
		fibo_series(n);
		
	}
	//Fibonacci number
	static int fibo_num(int x) {
		if (x==0) {
			return 0;
		}
		else if (x==1) {
			return 1;
			
		}
		else {
			return (fibo_num(x-1)+fibo_num(x-2));
		}
	}

	//fibonacci series
	static void fibo_series(int x) {
		int n1=0, n2=1,next=0;
		System.out.println(n1);
		System.out.println(n2);

		for (int i=2;i<=x-1;i++) {
			next=n1+n2;
			n1=n2;
			n2=next;
			System.out.println(next);

		}
		
	}
}
