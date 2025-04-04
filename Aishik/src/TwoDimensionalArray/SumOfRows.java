package TwoDimensionalArray;

import java.util.Scanner;

public class SumOfRows {
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
		
		sumRow(arr,rows,columns);
	}
		
	private static void sumRow(int[][] arr,int rows,int columns) {
			
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<columns;j++) {
				sum+=arr[i][j];			
			}
			System.out.println(sum);
		}
			
	}	
}
