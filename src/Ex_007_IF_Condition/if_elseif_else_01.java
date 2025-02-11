package Ex_007_IF_Condition;

import java.util.Scanner;

public class if_elseif_else_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number 1");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();

            System.out.println("Enter a number 2");
            int num2 = sc.nextInt();


            if (num1 == num2) {
                System.out.println("equal");
            } else if (num1 > num2) {
                System.out.println("num1 is greater");
            } else {
                System.out.println("num2 is greater");
            }


            sc.close();

        }else
            System.out.println("Invalid input -> only integers are allowed");
    }
}
