package assignment1;

public class Main {
    public static void main(String[] args) {
        Event concert  = new Event("epic Concert", "johntown");
        Event sleeping = new Event("naptime", "bed");

        TicketType good = new TicketType("good", 1.00);
	    TicketType bad  = new TicketType("bad", 9999.99);

        TicketManager manager = new TicketManager(2000);

        manager.createTicket(concert,  good, "Alice Smith");
        manager.createTicket(concert,  good, "Smith");
        manager.createTicket(concert,  good, "Alice");
        manager.createTicket(sleeping, bad,  "Alice2");
        manager.createTicket(sleeping, bad,  "John");

        // admit one
        manager.admitTicket(1);
        // cancel another
        manager.cancelTicket(2);
        
        // Invalid operation (admitting a cancelled ticket)
        boolean result = manager.admitTicket(2);
        System.out.println("Result from admitting a cancelled ticket: " + result);

        // printing
        System.out.println("\nAll tickets:");
        manager.printAll();

        System.out.println("\nTickets for sleeping event:");
        manager.printAllForSpecificEvent(sleeping);
    }
}