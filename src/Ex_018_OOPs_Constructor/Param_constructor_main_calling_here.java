package Ex_018_OOPs_Constructor;

import java.util.Scanner;

public class Param_constructor_main_calling_here
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of a person : ");
        String n1 = sc.nextLine();

        Param_constructor p1 = new Param_constructor(n1,"tester",2025);
        System.out.println("name : " +p1.name+"\n"+"model _prof: "+ p1.model+"\n"+"Year : "+p1.year);
    }
}
