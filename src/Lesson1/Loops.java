package Lesson1;

public class Loops {

	public static void main(String[] args) {
		// defining and declaring an array
		String [] names;
		names = new String [5];
		names[0]="Mannu";
		names[1]="Bhava";
		names[2]="choti";
		names[3]="jayu";
		names[4]="abhya";
		
		System.out.println("***************Do While loop***************");
		int i=0;
		do {
			System.out.println(names[i]);
			i++;
 	}
		while (i<6);
		
		System.out.println("********************** FOR loop****************");
 for (int n=0;n<6;n++) {
	 System.out.println(names[n]);	 
 }

	}

}
