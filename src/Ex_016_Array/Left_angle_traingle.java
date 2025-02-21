package Ex_016_Array;

import java.util.Scanner;

public class Left_angle_traingle
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();

        for(int i = num; i>=0; i--)
        {
            for(int j = i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
