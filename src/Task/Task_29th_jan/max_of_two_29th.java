package Task.Task_29th_jan;

import java.util.Scanner;

public class max_of_two_29th
{
    public static void main(String[] args) {
        //step1 - i/p -> num1 and num2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        if(!sc.hasNextInt())
        {
            System.out.println("only Integers not character or strings ");
            return;
        }
        int num1 = sc.nextInt();

        System.out.println("enter num2");
        int num2 = sc.nextInt();

        //step 2 - logic building / rough logic
        // num1 > num2 - num1 is grester else num2 is greater

        //step 3 - logic writing
        if(num1==num2)
        {
            System.out.println("equal");
            return;
        }
        if(num1 > num2)
        {
            System.out.println("num1 is max : "+num1);
        }else
        {
            System.out.println("num2 is max : "+num2);
        }
        //step 4 - edge cases
        //1 - what if number are equal
        //2 - what id number is not int
    }
}
