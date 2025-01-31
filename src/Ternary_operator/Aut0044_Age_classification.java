package Ternary_operator;

import java.util.Scanner;

public class Aut0044_Age_classification {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter a number for 1 to 100");
        if (Sc.hasNextInt()) {


            int age = Sc.nextInt();

            if (age < 0 || age > 100) {
                System.out.println("age should be in the range from 1 - 100");
                return;
            }

            String result = (age <= 18) ? "Minor" : ((age >= 65) ? "Senior" : "Adult");
            System.out.println(result);

        }
    }
}
