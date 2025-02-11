package Ex_008_Switch;

import java.util.Scanner;

public class switch_Month
{
    public static void main(String[] args)
    {

        //step 1 -> find out i/p and o/p
        // i/p -> 1- 12 month -> user input ->int DT
        // o/p -> string -> jan - dec -> println
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month (1 -4)");
        if(sc.hasNextInt()) {
            int month = sc.nextInt();

            //step 2 - rough logic //write logic

            switch (month) {
                case 1:
                    System.out.println("jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("apr");
                    break;
                default:
                    System.out.println("invalid");
            }
        }else {
            System.out.println("invalid Input only integer are allowed to enter");
        }

         sc.close();


    }
}
