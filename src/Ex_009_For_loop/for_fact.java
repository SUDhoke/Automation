package Ex_009_For_loop;

import java.util.Scanner;

public class for_fact
{
    public static void main(String[] args) {
        //factorial = 3 * 2 * 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = sc.nextInt();

        //step 1  -> o/p -> fact =? -> int
        int fact = 1;
        //logic ->
        for(int i = 1; i<=number ; i++)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
