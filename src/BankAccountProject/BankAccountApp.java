package BankAccountProject;

public class BankAccountApp {

					// Main method to inputs from user with their details like name, mob num,and deposit amount
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount ("Manohar Shinde","9766234753",40000);
		BankAccount acc2 = new BankAccount ("Ravikant Bhande","7024266981",65000);
		BankAccount acc3 = new BankAccount ("Susmita Swami","9769062351",50000);
		BankAccount acc4 = new BankAccount ("Jayshri Nagpurne","9004668422",45000);
		BankAccount acc5 = new BankAccount ("Abhijeet Chandramore","9730201867",55000);
		
		//methods to add transactions to a perticular account 
		acc1.makeDeposit(15000);
		acc2.payBills(24526);
	}

}
//Abstraction and encapsulation
class BankAccount implements Interest{
	//Abstraction
	//Encapsulation
	public String name;
	private String accnum;
	private static final String ifsc = "SBIN0011075"; //final variable for all account holders
	private String SSN;
	private static int id = 2017;
	private double balance;
	
	//Constructor 
	// calling to methods to show outputs
	
public BankAccount (String name,String SSN, double deposit) {
		
		balance = deposit;
		this.SSN =SSN;
		id++;
		setName();
		System.out.println("Your Name : " + name);
		setAccountNumber();
		System.out.print("Your account number : " + accnum + "\n") ;
		System.out.println("IFSC code : " + ifsc);
		System.out.println("You have deposited : " + deposit + "$");

}
		// Method to set System generated account number

	private void setAccountNumber() {
		int random = (int) (Math.random() * 1000);
		accnum = id + "" +	random + SSN.substring(0, 3);
	
}
		//To set name variable
	 private void setName () {
			this.name =name;
		}
	// To show balance 
	 public void showBalance() {
		 System.out.println("Your available balance : " + balance );
	 }
	 //Method for making deposit to a account
	 public void makeDeposit(double amount) {
		 balance = balance + amount;
		 System.out.println("Making Deposit of : " + amount +"$");
		 showBalance(); 
	 }
	 ///Methods to pay bill through available balance
	 public void payBills(double amount) {
		 balance = balance -amount ;
		 System.out.println("Paying bills of : " + amount +"$");
		 showBalance(); 
	 }
	 //Interface from which rate % is taken to calculate the compund interest
	@Override
	public void ComInterest() {
        balance = balance * (1+rate/100)		;
        System.out.println("You have available balance with interest ");
        showBalance();
	}
	//interface for simple interest
	@Override
	 public void SimpleInterest(){
		balance = balance + (balance*rate/100);
		showBalance();
	}
}















