package Lesson1;

public class Functions {
		public static void main (String[] args) {
			Myname();
			int x=15;
			int y=25;
			add(x/3,y/5);
			System.out.println("Product is "+multi(x,y));
			
		}
		static void Myname() {
			System.out.println("My name is Manohar Shinde");
		}
      static void add(int x,int y) {
    	  int sum;
    	  sum=x+y;
    	  System.out.println("Addition is "+ sum);
      }
      static int multi(int x,int y) {
    	  int product;
    	  product = x*y;
    	  return product;
    	    	  
      }
}
