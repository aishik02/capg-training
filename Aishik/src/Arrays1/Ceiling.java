package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ceiling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {2,5,7,9,12,23,42};
		
		System.out.println("ARRAY: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter number to find the ceiling of: ");
		int element=sc.nextInt();
		System.out.println(ceilOf(arr,element));
	}
	
	private static int ceilOf(int[] array,int element) {
			int start=0;
			int end=array.length-1;
			
			if (element>array[end]) {
				return -1;
			}
			
			while(end>=start) {
				
				int mid=start+(end-start)/2;
				
				//
				
				if (array[mid]==element)
					return mid;
				
				else if (array[mid]>element)
					end=mid-1;
				
				else if (array[mid]<element)
					start=mid+1;
			}
			
			return start;
			
	}
}
