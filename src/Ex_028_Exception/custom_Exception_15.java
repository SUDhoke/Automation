package Ex_028_Exception;

public class custom_Exception_15
{
    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking(100);
        try {
            tb.bookTickets(101);
        } catch (OverBookingException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

class TicketBooking
{
    int no_of_tickets;
    TicketBooking(int tickets)
    {
        this.no_of_tickets = tickets;
    }
    public void bookTickets(int requestedTickets) throws OverBookingException
    {
        if(no_of_tickets >= requestedTickets)
        {
            no_of_tickets = no_of_tickets - requestedTickets;
            System.out.println(no_of_tickets);
        }else
        {
            OverBookingException over = new OverBookingException("Tickets are sold and can not be over book");
            throw over;
        }
    }
}
class OverBookingException extends Exception
{
    OverBookingException(String Error_message)
    {
        super(Error_message);
    }
}