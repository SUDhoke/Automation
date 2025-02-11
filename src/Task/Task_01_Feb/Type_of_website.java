package Task.Task_01_Feb;

import java.util.Scanner;

public class Type_of_website
{
    public static void main(String[] args) {
        //Determine Types of website ends with different domain
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a wensite");
        String website = sc.next();

        if(website.endsWith(".com"))
        {
            System.out.println("The website type is: Commercial Website");
        } else if (website.endsWith(".org"))
        {
            System.out.println("The website type is: Non profit Website");
        } else if (website.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational Website");
        } else if (website.endsWith(".net"))
        {
            System.out.println("The website type is: network related Website");
        } else if (website.endsWith(".gov"))
        {
            System.out.println("The website type is: government Website");
        } else if (website.endsWith(".info"))
        {
            System.out.println("The website type is: Informational Website");
        } else if (website.startsWith("son"))
        {
            System.out.println("checking starts with working");

        } else
        {
            System.out.println("The website is not valid or unknown");
        }

        sc.close();
    }
}
