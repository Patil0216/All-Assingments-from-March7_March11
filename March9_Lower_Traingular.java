package Java.Fundamentals;

import java.util.Scanner;

public class March9_Lower_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int arry[][] = new int[r][c];
		int d = 2, count = 0, sum = 0;
		System.out.println("Enter array elements ::");
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[0].length; j++)

			{
				arry[i][j] = scan.nextInt();

			}

		}
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[0].length; j++)

			{
				System.out.print(arry[i][j] + "  ");

			}
			System.out.println();
			
		}
		System.out.println(	"Lower tringular matrix is");
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[0].length; j++)

			{
				if (j <= i) {
					System.out.print(arry[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
