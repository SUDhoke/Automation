package Ternary_operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto40_TO_positive_negative
{
    public static void main(String[] args) {
        try {

            // declare variable
            int number;
            // user input using scanner class
            Scanner sc = new Scanner(System.in);

            System.out.println("enter a number");

            number = sc.nextInt(); // this is in built function to ensure the integer values as i/p


            String result = (number < 0) ? "Negative number" : "Positive number";
            System.out.println(result);

        }catch(InputMismatchException e)
        {
            System.out.println("not a valid input");
        }
    }
}
