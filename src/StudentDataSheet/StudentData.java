package StudentDataSheet;

public class StudentData {

	public static void main(String[] args) {
     Student stu1 = new Student ("manohar","9766234753"); //C:\Users\asus\eclipse-workspace\MyFirstProject
     stu1.setCity("Parbhani");
     stu1.setPhone("9822304790");
     stu1.setState("Maharastra");
     System.out.println("Phone : " + stu1.getPhone() + "\nCity : "+ stu1.getCity() + "\nState : "+ stu1.getState());
	}

}
 // Abstraction and Encapsulation

	class Student{
	
		private String name;
		private static int  staticID = 2017;
		private String id;
		private String ssn;
		private String email;
		private String state;
		private String city;
		private String phone;
		private double balance ;
	
	//Constructor
		public Student(String name, String ssn) {
			this.name= name;
			this.ssn = ssn;
			setID();
			setEmail();
		}
		private void setID() {
			int random = (int) (Math.random() *10000);
			id = staticID + "" +random + ssn.substring(6, 10);
			System.out.println("ID : " + id);

		}
		private void setEmail() {
			String extension = "@vjti.com";
			email= name +""+extension;
			System.out.println("Your mail ID : " + email);
		}
		public void setPhone(String phone) {
			this.phone= phone;
			
		}
		public String getPhone() {
			return phone;
		}
		public void setCity(String city) {
			this.city= city;
			
		}
		public String getCity() {
			return city;
		}
		public void setState(String state) {
			this.state= state;
			
		}
		public String getState() {
			return state;
		}
	 public void enroll() {
		 
	 }
	 //Didnt get idea about what to in these below methods
	 private void pay(double amount) {
		 System.out.println("Amount Paying : " + amount);
		 balance= balance + amount;
		 
	 }
	 private void checkBalance() {
		 System.out.println("Available balance : " + balance);
		 
	 }
	 private void showCoarse() {
		 
	 }
}