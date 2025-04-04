package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixSum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter columns: ");
		int columns=sc.nextInt();
		
		int[][] arr=new int[rows][columns];
		
		System.out.println("Enter the numbers: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(EvenSum(arr,rows,columns));
	}
		
	private static int EvenSum(int[][] arr,int rows,int columns) {
		int sum=0;
			
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if (arr[i][j]%2==0)
					sum+=arr[i][j];			}
		}
			
		return sum;
	}
}		
