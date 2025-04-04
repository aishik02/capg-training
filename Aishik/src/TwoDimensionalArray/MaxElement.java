package TwoDimensionalArray;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
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
		
		
		System.out.println("Maximum element is in: "+Arrays.toString(maxElement(arr,rows,columns)));
	}
	
	private static int[] maxElement(int[][] arr,int rows,int columns) {
		int maxEle=arr[0][0];
		int[] result= {0,0};
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if (arr[i][j]>maxEle) {
					maxEle=arr[i][j];
					result[0]=i;
					result[1]=j;
				}
			}
		}
		return result;
	}
}
