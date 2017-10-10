package Oops;

public class BankAccountApp {

	public static void main(String[] args) {
		
		//Objects creating in the main function
		//instantiating 
		
		BankAccount acc1= new BankAccount();
		acc1.accname= "Manohar Shinde";
		acc1.accno = "20141007802";
		System.out.println(acc1.accname+"\n" + acc1.accno+"\n" +acc1.ifsc);
		
		BankAccount acc2 = new BankAccount(50000);
		
		BankAccount acc3 = new BankAccount ("Saving", 4000);
		

	}

}
