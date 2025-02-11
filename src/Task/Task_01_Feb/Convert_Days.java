package Task.Task_01_Feb;

import java.util.Scanner;

public class Convert_Days
{
    public static void main(String[] args) {
        //covert days into year month and days

        //take the days input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days for conversion");
        int t_days = sc.nextInt();

        //logic

        int no_of_year = 0;
        int no_of_month = 0;
        int day = 0;

        //Assume 1 year as 365 days
        //1months as 30 day
        //ex if you i/p 1000 days ,op-> 2 years 9 months and 0 days
        if(t_days >=365)
        {
            no_of_year = t_days / 365 ;
            System.out.println(no_of_year);
            t_days = t_days % 365;

        }
         if (t_days >=30)
         {
             no_of_month = t_days / 30 ;
             t_days = t_days % 30;

         }

         if (t_days > 0)
         {
            day = t_days;
         }

        System.out.println("Conversion  : "+no_of_year + " years,"+no_of_month+ " Months,"+day + " days");




    }
}
