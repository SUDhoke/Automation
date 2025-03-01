package Ex_020_Polymorphism.Method_oveloading.Method_overloading_practice;

public class Messenger
{
    public static void main(String[] args) {
        mess ms = new mess();
        ms.display_message();
        ms.String_msg("sonali");
        ms.print_msg("Hello",5);
    }
}
class mess
{
   static void display_message()
    {
        System.out.println("This is the Default message");
    }

    static void String_msg(String arg) {
        System.out.println(arg);
    }

    public void print_msg(String msg_d, int time)
    {
        for(int i =0; i<time; i++) {
            System.out.println(msg_d);
        }
    }
}
