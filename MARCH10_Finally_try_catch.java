package Java.Fundamentals;

import java.util.Scanner;

public class MARCH10_Finally_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere values");
        int n=scan.nextInt();
        int b=scan.nextInt();
       
        try {
        System.out.println(n/b);
        }
        catch(ArithmeticException ex) {
        	System.out.println(ex.getMessage());
        
        }
        finally {
        	  System.out.println("Hello");
        }
      
        
	}

}
