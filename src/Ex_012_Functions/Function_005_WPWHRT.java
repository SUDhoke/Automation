package Ex_012_Functions;

import java.sql.SQLOutput;

public class Function_005_WPWHRT
{
    public static void main(String[] args) {
    // first function
        F_name_Function_one("sonali");

        //second function calling -
        Add_function_two(5,6);

        //third function calling
        String_Full_name("Sonali","Dhoke");

    }


    //User defined - type 3 - with parameter and without return type

    //Example one - function one
    static void F_name_Function_one(String name)
    {
        System.out.println("HI " +name);
    }

    //Example 2 = function two
    static void Add_function_two(int a,int b)
    {
         int c = a+b;
        System.out.println(c);
    }
    //example 3 - function three
    static void String_Full_name(String F_name,String L_name)
    {
        System.out.println("Hello, I am\t"+ F_name + "\t"+ L_name);
    }
}
