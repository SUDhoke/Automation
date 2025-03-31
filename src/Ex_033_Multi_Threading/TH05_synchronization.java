package Ex_033_Multi_Threading;

public class TH05_synchronization
{
    public static void main(String[] args) {
        TicketBooking t = new TicketBooking();

        user u1 = new user(t,"pranvi ");
        user u2 = new user(t,"anaya ");
        u1.start();
        u2.start();


    }
}
//class for ticket booking system which hold actual logic
class TicketBooking
{
    static int seats = 1;

   synchronized public static void book_user(String user)
    {
        if(seats > 0)
        {
            System.out.println(user + "is booking a ticket");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(user + " booking is successful");
            seats--;
        }else {
            System.out.println(user + " failed to book : all sold out");
        }
    }


}
//class which extends thread
class user extends Thread
{
    TicketBooking bk;

    //constructor
    user(TicketBooking bk, String name)
    {
        super(name);
        this.bk = bk;

    }
    public void run()
    {
//        System.out.println(Thread.currentThread().getName());
        TicketBooking.book_user(Thread.currentThread().getName());
    }
}