package Oops;

public class BankAccount {
	// Constructor and overloading
	
	//Defining variables in class
	
	String accno;
	String accname;
	static final String ifsc = "kkbk11";
	// constructor
			//Unique method
			//implicitly called upon instantiation 
	BankAccount (){
		System.out.println("New account created");
	
	}
	
	//Overloading
	//it is again a constructor but with arguments
	
	BankAccount (int deposit){
		System.out.println("Initial deposit of ");
		System.out.println("Account has been credited with " + deposit);
	}
	
	//Overloading 
	BankAccount(String acctype,double balance){
		System.out.println("Your account type is " + acctype );
		System.out.println("Available balance : " + balance);
		
		
	}

}
