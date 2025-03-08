package Ex_024_Abstraction_Interface;

public class Interface
{
    public static void main(String[] args) {

        car_C result = new car_C();
        result.Drive_car();
    }
}
//by using interfaces we can achieve multiple inheritance - below example
class car_C implements Engine1,brakes
{
    //method - car_C
    void Drive_car()
    {
        star();
        System.out.println("Drive car - car_c class function/method");
        apply_brakes();
        stop();
    }

    @Override
    public void apply_brakes() {
        System.out.println("Apply Brakes - interface brakes ");
    }

    @Override
    public void star() {
        System.out.println("Start - Engine interface");
    }
    @Override
    public void stop()
    {
        System.out.println("Stop - Engine interface");
    }
}




//interface #1
interface Engine1
{
    void star();
    void stop();
    default void test()
    {
        System.out.println("It can have complete method but using default keyword");
    }
}

//interface #2
interface brakes
{
    void apply_brakes();
}