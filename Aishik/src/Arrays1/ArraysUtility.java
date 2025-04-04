package Arrays1;
import java.util.*;
public class ArraysUtility {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		arr=Arrays.copyOf(arr, 10);
		
		System.out.println(Arrays.toString(arr));
		
		arr=Arrays.copyOfRange(arr, 2, 6);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Binary search of 4: "+ Arrays.binarySearch(arr, 4));
	}
}	
