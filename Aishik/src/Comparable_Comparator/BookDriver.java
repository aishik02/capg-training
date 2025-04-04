package Comparable_Comparator;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		Book[] books= {
				new Book(324,"Looking For Alaska",299),
				new Book(224,"Perks of Being a Wallflower",399),
				new Book(564,"How Not to Give A F**K!",499)
		};
		
		SortByPrice byPrice=new SortByPrice();
		SortByTitle byTitle=new SortByTitle();
		
		System.out.println("-------------Original--------------");
		for(Book book:books) {
			System.out.println(book.toString());
		}
		
		System.out.println("-------------Default Sort--------------");
		
		Arrays.sort(books);
		
		for(Book book:books) {
			System.out.println(book.toString());
		}
		
		System.out.println("-------------By Title--------------");
		
		Arrays.sort(books,byTitle);
		
		for(Book book:books) {
			System.out.println(book.toString());
		}
		
		System.out.println("-------------By Price--------------");
		Arrays.sort(books,byPrice);
		
		for(Book book:books) {
			System.out.println(book.toString());
		}
	}
}
