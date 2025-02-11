package Task.Task_30th_jan;

import java.util.Scanner;

public class Smallest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter num3");
        int num3 = sc.nextInt();


        if(num1 < num2 && num1 < num3)
        {
            System.out.println("num1 is small");
        } else if (num2 < num3) {
            System.out.println("num2 is small");

        }else
        {
            System.out.println("num3 is small");
        }
    }
}
