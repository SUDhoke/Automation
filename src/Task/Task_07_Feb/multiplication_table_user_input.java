package Task.Task_07_Feb;

import java.util.Scanner;

public class multiplication_table_user_input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int multiplication = 0;
        //logic building
        for(int i = 1; i<=10; i++)
        {
            multiplication = num * i;
            System.out.printf("%d * %d = %d\n",num,i,multiplication);
        }
    }
}
