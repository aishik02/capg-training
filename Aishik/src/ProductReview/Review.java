package ProductReview;

public class Review {
	private String message;
	private Product product;
	
	public Review(String message, Product product) {
		this.message=message;
		this.product=product;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Product getProduct() {
		return product;
	}
	
	void display() {
		System.out.println(this.product.getProduct_name());
		System.out.println(this.message);
	}
}
