package Task;

import java.util.Scanner;

public class Prime_number_30th
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        int num = sc.nextInt();

        boolean prime ;
        if(num <= 1)
        {
            System.out.println("Not prime");
        }
        else if (num == 2 || num == 3)
        {
            System.out.println("Prime");
        }
        else if (num%2==0 || num%3==0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            for(int i = 5; i<=num; i++)
            {
                if(num % i == 0 || num %(i + 2) == 0)
                {
                    System.out.println("prime");
                }
            }

        }

    }
}
