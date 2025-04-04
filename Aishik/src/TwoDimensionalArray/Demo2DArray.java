package TwoDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2DArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter columns: ");
		int columns=sc.nextInt();
		
		double[][] arr=new double[rows][columns];
		
		System.out.println("Enter the numbers: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}
		
		for(double[] a:arr) {
			System.out.print(Arrays.toString(a));
			System.out.println();
		}
	}
}
