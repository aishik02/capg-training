package Arrays1;

import java.util.Arrays;

public class CallByValue {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		int[] arr2=changeValue(arr);
		System.out.println(Arrays.toString(arr2));
	}

	private static int[] changeValue(int[] array) {
		array=new int[2];
		array[0]=100;
		return array;
	}
}
