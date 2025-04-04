package ExceptionDemo;
import java.util.*;
public class ArrayExcept {
	public static void main(String[] args) {
		
		System.out.println("Program is started!");
		
		int[] arr= {1,2,3,4,5};
		
		ArrayList<Integer> arr1=null;
		
		try {
			System.out.println(arr[3]);
			System.out.println(arr1.get(0));
		}
		catch(NullPointerException e2) {
			System.out.println("Exception Message:");
			e2.printStackTrace();
		}
		catch(IndexOutOfBoundsException e1) {
			System.out.println("Exception Message:");
			e1.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception Message:");
			e.printStackTrace();
		}
		
		System.out.println("Program is executed!");
	}	
}
