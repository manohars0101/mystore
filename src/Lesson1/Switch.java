package Lesson1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
			// Switch statement 
		System.out.println("Please enter number between 1 - 7 to find out day of week");
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		if (num>7 || num <1) {
		System.out.println("Please enter valid number");	
	}
		else {
			// Switch block
			
			switch (num) {
			case 1 : System.out.println("Monday");
			case 2 : System.out.println("Tuesday");
			break;
			case 3 : System.out.println("Wednesday");
			break;
			case 4 : System.out.println("Thurday");
			break;
			case 5 : System.out.println("Friday");
			break;
			case 6 : System.out.println("Saturday");
			break;
			case 7 : System.out.println("Sunday");
			break;
		
			}
		}
	}

}
