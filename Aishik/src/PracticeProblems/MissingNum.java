package PracticeProblems;
import java.util.*;
public class MissingNum {
	public static void main(String[] args) {
		int[] arr= {9,6,4,2,3,5,7,0,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(Arrays.binarySearch(arr,i)==-1) {
				System.out.println(i + " is missing!");
				break;
			}
		}
	}
}
