package Task;

import java.util.Scanner;

public class Largest_of_three_30yh
{
    public static void main(String[] args) {
        //step1 - find out i/p / o/p
        //i/p -> n1 , n2, n3 - int
        //o/p -> largest number of three

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        if(!sc.hasNextInt())
        {
            System.out.println("only int - alphabets are not allowed");
            return;
        }
        int n1 = sc.nextInt();

        System.out.println("enter n2");
        if(!sc.hasNextInt())
        {
            System.out.println("only int - alphabets are not allowed");
            return;
        }
        int n2 = sc.nextInt();

        System.out.println("enter n3");
        if(!sc.hasNextInt())
        {
            System.out.println("only int - alphabets are not allowed");
            return;
        }
        int n3 = sc.nextInt();
        if(n1==n2 || n2==n3 || n1 == n3)
        {
            System.out.println("Equal - cant get compared");
            return;
        }

        if(n1>n2 && n1 > n3)
        {
            System.out.println("n1 is max : "+n1);
        } else if (n2 > n3) {
            System.out.println("n2 is max : "+n2);

        }else
        {
            System.out.println("n3 is max : "+n3);

        }
        sc.close();
        //step4 - edge cases
        // 1 - what if all the numbers are equal
        //2 - what id alphabet are entered

    }
}
