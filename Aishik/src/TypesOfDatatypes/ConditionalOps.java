package TypesOfDatatypes;

public class ConditionalOps {
	public static void main(String[] args) {
		int a=20;
		System.out.println((a%2==0)?"even":"odd");
		
		int b=30;
		int c=10;
		System.out.println((a>b && a>c)?"a":(b>c && b>a)?"b":"c");
		
		char ch='c';
		System.out.println((ch>=65 && ch<=96)?"upper case":(ch>=97 && ch<=102)?"lower case":"not an alphabet");
		
		int grade=65;
		System.out.println(grade>=90?"A+":grade>=85?"A":grade>=75?"B":"C");
	}
}
