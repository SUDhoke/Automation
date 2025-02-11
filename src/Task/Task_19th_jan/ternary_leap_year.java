package Task.Task_19th_jan;

import java.util.Scanner;

public class ternary_leap_year
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        String result = (year%4==0) && (year%100!=0)||(year%400==0)?"leap":"not a leap year";
        System.out.println(result);




    }
}
