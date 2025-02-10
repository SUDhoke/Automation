package Task;

import java.util.Scanner;

public class Electricity_Bill
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units");
        int unit = sc.nextInt();
        double bill = 0;

        if( unit <= 100)
        {
            bill = unit*0.50;
            System.out.println("Total for first 100 units :  "+bill);
        } else if (unit>=101 && unit<=200)
        {
            bill = unit*0.75;
            System.out.println("Total for 101 - 200 units : "+bill);
        } else if (unit>=201 && unit<=300)
        {
            bill = unit * 1.20;
            System.out.println("Total for 201 - 300 units : "+bill);
        } else
        {
            bill = unit * 1.50;
            System.out.println("Total above 300 units : "+bill);

        }
    }
}
