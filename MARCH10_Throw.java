package Java.Fundamentals;

import java.util.Scanner;

public class MARCH10_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere values");
        int index=scan.nextInt();
        int index1=scan.nextInt();
        int arr[]= {1,2,0,6,5};
		 
		 try {
				    if(index<10)
			 
				throw new RuntimeException("Vlaue is less than 10");
			 }
			 catch(RuntimeException ex)
	          {
	                 	System.out.println(ex.getMessage());
	          }
			     System.out.println("Out of code");
}

}
