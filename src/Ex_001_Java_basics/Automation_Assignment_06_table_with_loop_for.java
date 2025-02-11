package Ex_001_Java_basics;

import java.util.*;
public class Automation_Assignment_06_table_with_loop_for
{
    public static void main(String[] args)
    {
     int j;
     Scanner number=new Scanner(System.in);
     System.out.println("Enter a value");
     j=number.nextInt();

     for(int i=1;i<=10;i++)
     {
         System.out.println(i*j);

     }

    }
}
