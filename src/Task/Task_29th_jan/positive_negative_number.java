package Task.Task_29th_jan;

import java.util.Scanner;

public class positive_negative_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number");
        if(!sc.hasNextInt())
        {
            System.out.println("only int");
            return;
        }
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("positive");

        } else if (num == 0)
        {
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("negative");
        }
    }
}
