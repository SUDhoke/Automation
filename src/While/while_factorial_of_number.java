package While;

import java.util.InputMismatchException;
import java.util.Scanner;

public class while_factorial_of_number
{
    public static void main(String[] args)
    {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial");

        try{
            int n = sc.nextInt();


        //nt n = 5;

            if (n < 0) {
                System.out.println("number should be positive only and > 0");
                return;
            }
            while (n > 0) {
                fact = n * fact;
                n--;
            }
        }catch(InputMismatchException ex)
        {
            System.out.println("only Integers are allowed to enter");
        }
        System.out.println(fact);
            sc.close();

    }
}
