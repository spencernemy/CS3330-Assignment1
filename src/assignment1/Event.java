package assignment1;

public final class Event {
	private String name;
	private String location;
	
	public Event(String name, String location) {
		if (name == null || name.isBlank() || location == null || location.isBlank()) {
			throw new IllegalArgumentException("Name and location cannot be blank");
		}
		
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return name + " @ " + location;
	}
}
