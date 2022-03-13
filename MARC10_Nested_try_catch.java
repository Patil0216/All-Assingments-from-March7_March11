package Java.Fundamentals;

import java.util.Scanner;

public class MARC10_Nested_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere values");
        int index=scan.nextInt();
        int index1=scan.nextInt();
        int arr[]= {1,2,0,6,5};
		 try {
			 try {
				 System.out.println(arr[index]/arr[index1]);
			 } 
			 catch(ArithmeticException ex){
				 System.out.println(ex.getMessage());
				 System.out.println(ex.toString());
			 }
			 catch(ArrayIndexOutOfBoundsException ex){
				 System.out.println(ex.getMessage());
				 System.out.println(ex.toString());
			 }
		 } catch(ArithmeticException ex){
			 System.out.println(ex.getMessage());
			 System.out.println(ex.toString());
		 }
		 catch(ArrayIndexOutOfBoundsException ex){
			 System.out.println(ex.getMessage());
			 System.out.println(ex.toString());
		 }
		 finally {
			 System.out.println("Wrong input");
		 }
			 
		 

}

}
