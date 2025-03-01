package Ex_020_Polymorphism.Method_overriding.Method_overriding_practice;

public class Online_payment_system
{
    public static void main(String[] args) {
        payment p3 = new payment();
        System.out.println("Default fee : "+p3.transaction_fee());

        payment p = new credit_card();
        System.out.println("Credit card fee: "+p.transaction_fee());

        payment p1 = new debit_card();
        System.out.println("debit card fee : "+p1.transaction_fee());
    }
}
//superclass
class payment
{
    int transaction_fee()
    {
        return 100;
    }
}
//derived class
class credit_card extends payment
{
    @Override
    int transaction_fee()
    {
        return 150;
    }
}
class debit_card extends payment
{
    @Override
    int transaction_fee() {
        return 200;
    }
}