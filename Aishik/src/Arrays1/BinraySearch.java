package Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class BinraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {5,6,23,68,24,3,35};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element you want to search: ");
		int number=sc.nextInt();
		System.out.println(binarySearch(arr, number));
	}
	
	public static int binarySearch(int[] array,int num) {
		
		
		int start=0;
		int end=array.length-1;
		while(end>start) {
			int mid =start+(end-start)/2;
			if (array[mid]==num)
				return mid;
			else if(array[mid]<num) {
				start=mid+1;
			}
			else if(array[mid]>num)
				end=mid-1;
		}
		return -1;
	}
}		
