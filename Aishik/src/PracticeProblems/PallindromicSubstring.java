package PracticeProblems;
import java.util.*;
public class PallindromicSubstring {
	public static int checkPallindrome(String s, int left, int right) {
		int count=0;
		while(left>=0 && right < s.length()) {
			if(s.charAt(left)==s.charAt(right)) {
				count++;
			}
			left--;
			right++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		int len=str.length();
		int count=0;
		
		for(int i=0;i<len;i++) {
			count +=checkPallindrome(str, i, i);
			count +=checkPallindrome(str, i, i+1);
		}
		
		System.out.println("Count of Pallindromic Substrings: "+count);
	}
}
