package Arrays;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int size=sc.nextInt();
	
		double[] arr=new double[size];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextDouble();
		}
		
		for(int j=size-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
