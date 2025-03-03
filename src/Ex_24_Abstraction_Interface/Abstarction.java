package Ex_24_Abstraction_Interface;

public class Abstarction
{
    public static void main(String[] args) {

        cars h = new cars();
        h.drive();

    }
}

class cars extends Engine
{
    @Override
    void startEngine() {
        System.out.println("Start Engine"); // here we are completing the incomplete function of a parent
    }
   void drive()
   {
       startEngine();
       System.out.println("Driving the car");
       stopEngine();
   }
}
//abstract class
abstract class Engine
{
    //constructor - in abstract class constructor are useless
    Engine()
    {

    }
    //abstract method
 abstract void startEngine();
//    {
//        System.out.println("start"); // not possible abstract method always incomplete and do not have any block of code

//    }

    void stopEngine()//abstract class - it can have concrete method means - complete method
    {
        System.out.println("Stop Engine");
    }

}
//interface
interface Tyre
{
//    void m1()
//    {
//        System.out.println();
//    } not possible to have complete function with body

    //incomplete function
    void m2();

    //interface can not have constructor
//    Tyre()
//    {
//
//    }
}