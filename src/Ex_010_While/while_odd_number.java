package Ex_010_While;

import java.util.Scanner;

public class while_odd_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        int num = 1;

        while(num<=n)
        {
            if(num%2!=0)
            {
                System.out.println("odd :"+num);

            }
            num++;
        }
    }
}
