package ProductReview;

public class ReviewDriver {
	public static void main(String[] args) {
		Product product=new Product("iPhone 16 Pro Max");
		Review r1=new Review("Average",product);
		Review r2=new Review("Poor",product);
		
		r1.display();
		r2.display();
				
	}
}
