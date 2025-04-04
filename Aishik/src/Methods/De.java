package Methods;

import java.util.Scanner;

public class De {
	public static void main(String[] args) {
		Scanner sc = new Scanner("10 20,30?40+78");
		sc.useDelimiter("[?, ]");
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
	}

}