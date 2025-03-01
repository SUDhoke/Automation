package Ex_019_OOPs_Inheritance.practice_inheritance;

import java.util.*;

public class Vehicle_information_system
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand");
        String brand = sc.nextLine();

        System.out.println("Enter Model");
        String model = sc.nextLine();

        System.out.println("Enter Year");
        int year = sc.nextInt();

        System.out.println("Enter fuel_type");
        String fuel_type = sc.next();

        System.out.println("Enter Mileage");
        int mileage = sc.nextInt();

        car c = new car(brand,model,year,fuel_type,mileage);
        System.out.println(".........vehicle details.........");
        c.display_vehicle_info();
        System.out.println("...........All details..........");
        c.Display_all();
    }
}
//superclass/base class
class vehicle
{
    //attributes
    String brand;
    String model;
    int year;

    //constructor
    vehicle(String b, String m,int y)
    {
        this.brand = b;
        this.model = m;
        this.year = y;
    }
    void display_vehicle_info()
    {
        System.out.println("Vehicle info:"+"\nBrand_name:"+brand +"\n Model_name: "+model + "\nYear: "+year);
    }

}
//subclass /derived class
class car extends vehicle
{
    String fuel_type;
    int mileage;

    //constructor
    car(String br,String Mo,int yr,String fuel,int mil)
    {
        super(br,Mo,yr);
        this.fuel_type = fuel;
        this.mileage = mil;
    }
    void Display_all()
    {
        super.display_vehicle_info();
        System.out.println("Fuel_Type :"+fuel_type +"\nMileage : "+mileage);
    }
}
