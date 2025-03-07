package Task.Task_07_Feb;

import java.util.Scanner;

public class Factorial_number
{
    public static void main(String[] args) {
        //fact = 3! = 3 * 2 * 1

        //logic building
        // i/p = number
        //o/p  = fact
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial");
        int num = sc.nextInt();

        for (int i = num; i >= 1 ; i--)
        {

            fact = fact * i;
        }
        System.out.println("factorial of a number :"+fact);

    }
}
