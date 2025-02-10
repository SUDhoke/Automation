package Switch;

import java.util.Scanner;

public class switch_menusforDayofweek
{
    public static void main(String[] args) {
        //step 1 = i/p -> int -> 1 to 3 value - take user i/p
        //o/p -> string -> sunday

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input");
        int input = sc.nextInt();
        String result = "test";

        switch(input)
        {
            case 1 :
                System.out.println("sunday");
                result = "Relax and rest";
                break;
            case 2:
                System.out.println("Monday");
                result = "Prepare for the week ahead";
                break;
            case 3 :
                System.out.println("Sunday");
                result = "Enjoy the weekend";
                break;
            default:
                System.out.println("work hard on other days");
        }
        System.out.println("menu for the days on week: "+result);
    }
}
