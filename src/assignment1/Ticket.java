package assignment1;

public class Ticket {
	private final int id;
	private final Event event;
	private final TicketType ticketType;
	private final String studentName;
	private boolean canceled;
	private boolean admitted;
	
	public Ticket(int id, Event event, TicketType ticketType, String studentName) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID must be positive");
		}
		
		if (event == null || ticketType == null) {
			throw new IllegalArgumentException("Event and ticket type cannot be null");
		}
		
		if (studentName == null || studentName.isBlank()) {
			throw new IllegalArgumentException("Student name cannot be blank");
		}
		
		this.id = id;
		this.event = event;
		this.ticketType = ticketType;
		this.studentName = studentName;
		canceled = false;
		admitted = false;
	}
	
	public boolean cancel() {
		if (canceled || admitted) {
			return false;
		}
		
		canceled = true;
		return true;
	}
	
	public boolean admit() {
		if (canceled || admitted) {
			return false;
		}
		
		admitted = true;
		return true;
	}
	
	public boolean isCanceled() {
		return canceled;
	}
	
	public boolean isAdmitted() {
		return admitted;
	}
	
	public boolean isActive() {
		return !canceled && !admitted;
	}
	
	public int getId() {
		return id;
	}
	
	public Event getEvent() {
		return event;
	}
	
	public String toString() {
		String status = "Active";
		if (isCanceled()) { status = "Canceled"; }
		else if (isAdmitted()) { status = "Admitted"; }
		
		return "Ticket ID: " + id + " | Student: " + studentName + " | Event: " + event + " | Ticket Type: " + ticketType + " | Status: " + status;
	}
}
