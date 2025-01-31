package IF_Condition;

import java.util.Scanner;

public class IF_positive_negative_zero
{
    public static void main(String[] args) {
        //take a input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if(num==0)
            {
                System.out.println("Zero");
            } else if (num<0) {
                System.out.println("Negative");
            }else {
                System.out.println("positive");
            }

        }

    }
}
