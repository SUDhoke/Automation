package Ternary_operator;

import java.util.Scanner;

public class gr_than_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if (sc.hasNextInt()) {

            int num = sc.nextInt();

            String GR_10 = (num == 10) ? "Equal" : (num > 10) ? "grater than 10" : "less than 10";
            System.out.println(GR_10);

        }
    }
}
