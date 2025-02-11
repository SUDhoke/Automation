package Ex_008_Switch;

import java.util.Scanner;

public class Switch_browser
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Browser");
        String B = s.next();

        switch(B)
        {
            case "chrome" :
                System.out.println("chrome");

            case "edge" :
                System.out.println("Edge");
                break;
            case "firefox":
                System.out.println("firefox");
                break;
            default:
                System.out.println("not aware");
                break;
        }

    }
}
