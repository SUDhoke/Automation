package Ex_007_IF_Condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class if_elseif_else_Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");

        try {

            if (!sc.hasNextInt()) {
                System.out.println("year must be in Integer");
            }
            int year = sc.nextInt();
            if (year <= 0) {
                System.out.println("year can not be less than 0 and 0");
            } else if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        }catch(InputMismatchException e)
        {
            System.out.println("Not valid input");
        }
        }
    }

