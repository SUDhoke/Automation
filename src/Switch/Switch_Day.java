package Switch;

import java.util.Scanner;

public class Switch_Day
{
    public static void main(String[] args) {
         // user i/p - 1-7 day
        //o/p which day it is -> mon - sun

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value (1 - 7)");
        int day = sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday! fun day");
                break;
            default :
                System.out.println(" i dont know");
        }
    }
}
