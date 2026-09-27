package assignment1;

public class TicketBook {
    private Ticket[] tickets;
    private int count;
    public void createTicket(int id, Event event, TicketType type, String studentName){
        tickets[count] = new Ticket(id, event, type, studentName);
        if (count >= tickets.length) {
        throw new IllegalStateException("Ticket book is full");
        }
        count +=1;
    }
    
    public Ticket findById(int id) {
    for (int i = 0; i < count; i++) {
        if (tickets[i].getId() == id) {
            return tickets[i];
        }
    }
    return null;
    }
    public void printAll(){
        for (int i=0; i<count; i++){
            System.out.println(tickets[i]);

        }

    }

}