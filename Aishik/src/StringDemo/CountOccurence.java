package StringDemo;

public class CountOccurence {
	public static void main(String[] args) {
		String s= "engineer";
		
		int count=0;
		char c='e';
		
		for(char ch:s.toCharArray()) {
			if(ch==c) {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
