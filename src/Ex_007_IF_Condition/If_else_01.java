package Ex_007_IF_Condition;

import java.util.Scanner;

public class If_else_01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int age = sc.nextInt();

        if (age >=18)
        {
            System.out.println("You are allowed to vote");
        }else {
            System.out.println("You are not allowed to vote due to age ");
        }
     sc.close();
    }
}
