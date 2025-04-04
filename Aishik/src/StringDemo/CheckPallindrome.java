package StringDemo;

public class CheckPallindrome {
	public static void main(String[] args) {
		String s="GAooooAG";
		boolean check=true;
		char[] c=s.toCharArray();
		int len=c.length;
		
		for (int i=0;i<len/2;i++) {
			if (c[i]!=c[len-i-1]) {
				check=false;
			}
		}
		System.out.println(check);
	}
}
