package Lesson1;

import java.util.Scanner;

public class If_Else {
		public static void main (String [] args) {
			//Defining variables
			int total;
			float per;
			//taking user input 
			System.out.println("Please enter marks obtained in Physics, Chemistry and Maths");
			Scanner s1=new Scanner (System.in);
			int p =s1.nextInt();
			Scanner s2= new Scanner (System.in);
			int c = s2.nextInt();
			Scanner s3 =new Scanner (System.in);
			int m = s3.nextInt();
			total = p+c+m;
			per = total/3;
			//Showing output 
			System.out.println("Physics = " + p + " Chemistry = " + c +" Maths = " + m);
			System.out.println("Total =  " + total);
			System.out.println("Percentage = "+ per + "%");
			//using conditional statements 
			System.out.println("Grade");
			if (per > 75.0) {
				System.out.println( "A++");
		}
			else if ( per >65.0) {
				System.out.println("B");		
		}
			else if (per>50.0) {
				System.out.println("C");
			}
			else {
				System.out.println("Failed");
			}
}
}
