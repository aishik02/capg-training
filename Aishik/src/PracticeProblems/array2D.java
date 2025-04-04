package PracticeProblems;
import java.util.*;
public class array2D {
	public static void main(String[] args) {
		int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
		modifyMatrix(arr);
		for(int[] row:arr) {
			System.out.println(Arrays.toString(row));
		}
	}

	public static void modifyMatrix(int[][] arr) {
		int[][] res=new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				res[i][j]=arr[i][j];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==0) {
					for(int k=0;k<arr[0].length;k++) {
						res[i][k]=0;
					}
					for(int k=0;k<arr[0].length;k++) {
						res[k][j]=0;
					}
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=res[i][j];
			}
		}
		
	}
}
