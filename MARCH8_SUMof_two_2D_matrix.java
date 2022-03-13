package Java.Fundamentals;

import java.util.Scanner;

public class MARCH8_SUMof_two_2D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int r = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("Enter array1 size");
		int p= scan.nextInt();
		int v = scan.nextInt();
		int arry[][] = new int[r][c];
		int arry1[][] = new int[p][v];
		int sum[][]=new int[r][c];
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
			System.out.print(arry[i][j]+"  ");

			}
			System.out.println();
		}
		System.out.println("Enter array1 elements ::");
		for (int i = 0; i < arry1.length; i++) {
			for (int j = 0; j < arry1[0].length; j++)

			{
				arry1[i][j] = scan.nextInt();

			}

		}
		for (int i = 0; i < arry1.length; i++) {
			for (int j = 0; j < arry1[0].length; j++)

			{
			System.out.print(arry1[i][j]+"  ");

			}
			System.out.println();
		}
		for (int i = 0; i < arry1.length; i++) {
			for (int j = 0; j < arry1[0].length; j++)

			{
				sum[i][j]=arry[i][j]+arry1[i][j];
				
			}
			System.out.println();
			}
		for (int i = 0; i < arry1.length; i++) {
			for (int j = 0; j < arry1[0].length; j++)

			{
			System.out.print(sum[i][j]+"  ");

			}
			System.out.println();
		
	}
	}
}
