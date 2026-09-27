package assignment1;

public class TicketManager {
    private int counter;
    private TicketBook ticketBook;

    public TicketManager(int capacity) {    
        this.ticketBook = new TicketBook(capacity);
        this.counter = 0;
    }

    public void createTicket(Event event, TicketType type, String studentName) {
        counter++;
        ticketBook.createTicket(counter, event, type, studentName);
    }

    public void cancelTicket(int id) {
        Ticket t = ticketBook.findById(id);  
        if (t.cancel()) {
            System.out.println("Successfully cancelled Ticket\n");
        } else {
            System.out.println("Failed! Ticket was already cancelled or admitted\n");
        }
    }

    public void admitTicket(int id) {
        Ticket t = ticketBook.findById(id);
      
        if (t.admit()) {
            System.out.println("Successfully admitted Ticket\n");
        } else {
            System.out.println("Failed; ticket was already admitted or cancelled\n");
        }
    }

    public void printAll() {
        ticketBook.printAll();
    }

    public void printAllForSpecificEvent(Event event) {
        ticketBook.printAllForSpecificEvent(event);
    }
}