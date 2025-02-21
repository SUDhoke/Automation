package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class Flight_Ticket_reservation
{
    public static void main (String[] args) {

        Ticket T1 = new Ticket("Sonali_Dhoke",562389,85,5560);
        T1.Print_details();
    }
}
class Ticket
{
    //Attributes
    String P_name;
    int F_num;
    int S_num;
    float price;

    //Constructor
    Ticket(String Pas, int Fl, int seat, float pr)
    {
        this.P_name = Pas;
        this.F_num = Fl;
        this.S_num = seat;
        this.price = pr;

    }
    //method to print the ticket details
    public void Print_details()
    {
        System.out.println("printing flight ticket details : ");
        System.out.println("passanger name : "+P_name);
        System.out.println("Flight_number : "+F_num);
        System.out.println("Seat_Number : "+S_num);
        System.out.println("price : "+price);
    }
}
