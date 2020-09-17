package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product prd;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product prd) {
		this.quantity = quantity;
		this.price = price;
		this.prd = prd;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getPrd() {
		return prd;
	}

	public void setPrd(Product prd) {
		this.prd = prd;
	}

	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return prd.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

}
