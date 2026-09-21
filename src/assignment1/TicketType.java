package assignment1;

public final class TicketType {
	private String name;
	private double price;
	
	public TicketType(String name, double price) {
		if (name == null || name.isBlank() || price < 0) {
			throw new IllegalArgumentException("Name cannot be blank and price must be non-negative");
		}
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name + ": $" + price;
	}
	
}
