package Ex_020_Polymorphism.Method_overriding.Method_overriding_practice;

public class Speedlimit
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        System.out.println("Default Speed :"+v1.s_limit(100));

        Vehicle v2 = new Car();
        System.out.println("Car speed : "+v2.s_limit(500));

        Vehicle v3 = new Bike();
        System.out.println("Bike speed :"+v3.s_limit(205));
    }
}
//superclass
class Vehicle
{
    int s_limit(int s1)
    {
        return 60;
    }
}
class Car extends Vehicle {
    @Override
    int s_limit(int s2) {
        return 120;
    }
}
class Bike extends Vehicle
{
    @Override
    int s_limit(int s1) {
        return super.s_limit(50);
    }
}
