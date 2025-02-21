package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class BankAccount_con_class_obj
{

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        BankAccount b2 = new BankAccount(12345678,"sonali_Dhoke",258.13);
    }
}
class BankAccount
{
    int Account_number;
    String Account_holder;
    double balance;

    //Default constructor

    BankAccount()
    {
        System.out.println("Default Constructor: ");
        Account_number = 000000;
        Account_holder = "unknown";
        balance = 0.0d;

    }
    //param constructor
    BankAccount(int acc_no,String acc_h,double bal)
    {
        this.Account_number = acc_no;
        this.Account_holder = acc_h;
        this.balance = bal;
        System.out.println("Account_number : "+acc_no +"\n"+"Account_holder :"+acc_h+"\n"+"Balance : "+bal);
    }
}
