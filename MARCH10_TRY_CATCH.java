package Java.Fundamentals;

import java.util.Scanner;

public class MARCH10_TRY_CATCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Entere values");
        int index=scan.nextInt();
        int index1=scan.nextInt();
        int arr[]= {1,2,0,6,5};
        try {
        System.out.println(arr[index]/arr[index1]);
        }
        catch(Exception ex) {
        	System.out.println(ex.getMessage());
        	
        }
        System.out.println("Wrong input");
	}

}
