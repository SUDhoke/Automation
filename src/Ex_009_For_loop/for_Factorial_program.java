package Ex_009_For_loop;

import java.util.Scanner;

public class for_Factorial_program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(!sc.hasNextInt())
        {
            System.out.println("only integers are allowed to enter");
            return;
        }
        int num = sc.nextInt();

        int fact = 1;
        if(num < 0)
        {
            System.out.println("< 0 is not allowed to enter ");
            return;
        }
        for( int i = 0; num>i; num--)
        {
            fact = num*fact;

        }
        System.out.println(fact);
        sc.close();
    }
}
