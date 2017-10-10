package Lesson1;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers");
		Scanner s1=new Scanner(System.in);
		int x= s1.nextInt();
		Scanner s2 = new Scanner (System.in);
		int y= s2.nextInt();
		int sum;
		sum= x+y;
		System.out.println("sum = ");

		System.out.print(sum);
		Scanner s3 = new Scanner (System.in);
		String name = s3.nextLine();
		System.out.println(name);
				
	}

}
