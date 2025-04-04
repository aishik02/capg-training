package Comparable_Comparator;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.title.compareTo(o2.title);
	}

}
