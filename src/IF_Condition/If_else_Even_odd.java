package IF_Condition;

import java.util.Scanner;

public class If_else_Even_odd {
    public static void main(String[] args) {

       //  step 1 - figure out inputs and outputs datatype and other details
        // i/p -> take a user input a number -> datatype -> int
        //o/p -> string -> Even / odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
       int num = sc.nextInt();

        if (sc.hasNextInt())
        {

            //step 2 - rough logic
            //num%2==0 -> even else odd

            // write down the  logic

            if (num % 2 == 0)
            {
                System.out.println("Even");
            } else
            {
                System.out.println("Odd");

                //step 4  - edge cases
                //1 - > it must take only integer respose ->
                // decimal values how to handle
            }
        }else
        {
            System.out.println("Invalid Input!");
        }
           sc.close();
    }
}
