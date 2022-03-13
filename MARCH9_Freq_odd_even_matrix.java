package Java.Fundamentals;

import java.util.Scanner;

public class MARCH9_Freq_odd_even_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int arry[][] = new int[r][c];
		int count1=0 ,count=0;
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

			{
				if(arry[i][j]%2==0) {
					count++;
				}
				else {
					count1++;
				}
			}
			
		}
		System.out.println("Even numbers present in matrix are:-> "+count);
		System.out.println("Odd numbers present in matrix are:-> "+count1);
	}

}
