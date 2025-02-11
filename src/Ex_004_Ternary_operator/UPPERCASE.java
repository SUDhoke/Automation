package Ex_004_Ternary_operator;

import java.util.Scanner;

public class UPPERCASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = sc.nextLine();
        char ch = input.charAt(0);

        if (input.length()!=1)
        {
            System.out.println("only single character is allowed");
            return;
        }

        if (Character.isAlphabetic(ch)) {

            String UP = (ch >= 'A') && (ch <= 'Z') ? "Uppercase" : "Lowercase";
            System.out.println(UP);
        } else {
            System.out.println("Enter valid character only");

        }


    }
}
