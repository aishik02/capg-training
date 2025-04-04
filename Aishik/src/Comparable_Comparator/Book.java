package Comparable_Comparator;

public class Book implements Comparable<Book>{
	int id;
	String title;
	double price;
	
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}

	@Override
	public int compareTo(Book o) {
		return this.id-o.id;
	}
	
	@Override
	public String toString() {
		return id+"\t"+title+"\t"+price;
	}
}
