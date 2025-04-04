package PracticeProblems;
import java.util.*;
public class SumArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] res=sumArray(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] sumArray(int[] arr) {
		int[] result=new int[arr.length];
		int sum=0;
		int j=0;
		for (int i:arr) {
			sum+=i;
			result[j]=sum;
			j++;
		}
		return result;
	}
}
