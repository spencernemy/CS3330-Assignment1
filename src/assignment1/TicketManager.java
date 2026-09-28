package assignment1;

public class TicketManager {
    private int counter;
    private TicketBook ticketBook;

    public TicketManager(int capacity) {    
        this.ticketBook = new TicketBook(capacity);
        this.counter = 0;
    }

    public Ticket createTicket(Event event, TicketType type, String studentName) {
        counter++;
        return ticketBook.createTicket(counter, event, type, studentName);
    }

    public boolean cancelTicket(int id) {
        Ticket ticket = ticketBook.findById(id);  
        
        if (ticket == null) {
        	return false;
        }
        
        return ticket.cancel();
    }

    public boolean admitTicket(int id) {
        Ticket ticket = ticketBook.findById(id);
      
        if (ticket == null) {
        	return false;
        }
        
        return ticket.admit();
    }

    public void printAll() {
        ticketBook.printAll();
    }

    public void printAllForSpecificEvent(Event event) {
        ticketBook.printForEvent(event);
    }
}