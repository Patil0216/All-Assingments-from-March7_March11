package Java.Fundamentals;

import java.util.Scanner;

public class MARCH9_Sparse_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int arry[][] = new int[r][c];
		int size=c*r, count=0;
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
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[0].length; j++)

			{ if(arry[i][j]==0) {
				count++;
			
			}
		}}
		if(count>size/2)
		{
			System.out.println("Given matrix is sparse matrix");
		}
		else {
			System.out.println("Given matrix is not sparse matrix");
		}
	}

}
