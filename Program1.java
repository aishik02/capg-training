import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		int range=sc.nextInt();
		System.out.println("Sequence: ");
		
		for(int i=0;i<=range;i++){
			System.out.print(i+" ");
		}	
	}
}
