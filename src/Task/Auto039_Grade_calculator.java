package Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto039_Grade_calculator {
    public static void main(String[] args) {
        //step 1 : find out i/p and o/p
        // i/p : take input using scanner between 0 - 100
        //o/p : Grades A B C D E F

        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 0 - 100");
            double i = sc.nextDouble();


            if (i < 0 || i > 100) {
                System.out.println("not allowed to enter number");
                return;
            }
            int j = (int)Math.round(i);

            if (i >= 90 && i <= 100) {
                System.out.println("A Distinction ");

            } else if (i >= 80 && i <= 89) {
                System.out.println("B");
            } else if (i >= 70 && i <= 79) {
                System.out.println("C");
            } else if (i >= 60 && i <= 69) {
                System.out.println("D");
            } else if (i >= 0 && i <= 59) {
                System.out.println("F");
            }
        } catch (InputMismatchException e) {
            System.out.println("Not allowed to enter such inputs");

        }
    }
}


