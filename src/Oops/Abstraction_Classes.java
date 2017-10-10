package Oops;

	 class Person {
		 String name;
		 String mob;
		 String email;
		 
		 void walk() {
			 System.out.println(name + " is walking. ");
			 
		 }
		 void mail() {
			 System.out.println(email + " is his mail ID");
		 }
		 
	 }
public class Abstraction_Classes {

	public static void main(String[] args) {
		// Single person
		Person man1= new Person ();
		man1.name="manu";
		man1.mob = "9766234753";
		man1.email = "manohars0101";
		man1.walk();
		man1.mail();
		
		//Second entry
		
		Person man2 = new Person();
		man2.name="Bhava";
		man2.email= "ravibhand";
		man2.mob= "7024618962";
		
		man2.walk();
		man2.mail();
		System.out.println(man2.mob);
		
System.out.println(man1.mob);
		
		/*
		//Normal programming 
		
		String name = "Manohar";
		String Mob = "984455845";
		String email = "manni.gmail";
		
		System.out.println(name + " is walking ");
		System.out.print(Mob +  " is his no");
		
		String name2 = "Ravi ";
		String mob2 = "702457255";
		String email2 ="bhande.gmail";
		
		System.out.println("\n" + name2 + " is walking ");
		System.out.print(mob2 +  " is his no");
		
		
				*/
	}

}
