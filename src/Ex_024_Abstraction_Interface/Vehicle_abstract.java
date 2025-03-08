package Ex_024_Abstraction_Interface;

public class Vehicle_abstract
{
    public static void main(String[] args) {

        car_abstract ca = new car_abstract();
        ca.fuel_Efficiency();

        bike bk = new bike();
        bk.fuel_Efficiency();
        bk.tyre_company();
        bk.engine_company();
        System.out.println(bk.fule_e);
    }
}
//abstract class
abstract class vehicle_a
{
    int fule_e;

    vehicle_a(int fuel)
    {
        this.fule_e = fuel;
    }
    //abstract method
    abstract void fuel_Efficiency();

    //complete method - abstraction can have abstract as well as complete method - it can also have constructor but it is useless
    public void details()
    {
        System.out.println("Vehicle details ");
    }
    }

    class car_abstract extends vehicle_a
    {
        car_abstract()
        {
            super(100);
        }

        @Override
        void fuel_Efficiency()
        {
            System.out.println("Car fuel Efficiency is "+super.fule_e);
        }
    }
    //class which has the
    class bike extends vehicle_a implements tyre1,Engine_v
    {
        //constructor
        bike()
        {
            super(200);
        }

        //method - fuel efficiency from - vehicle_a
        @Override
        void fuel_Efficiency()
        {
            System.out.println("Fule Efficiency of bike :"+super.fule_e);
        }

        @Override
        public void engine_company() {
            System.out.println("Bike engine  : Engine company");
        }

        @Override
        public void tyre_company() {
            System.out.println("Bike tyres : tyre company");
        }
    }
   interface tyre1
   {
       void tyre_company();
   }
   interface Engine_v
   {
       void engine_company();
   }
