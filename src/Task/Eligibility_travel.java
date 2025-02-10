package Task;

import java.util.Scanner;

public class Eligibility_travel
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age (integer)");
        int Age = sc.nextInt();

        System.out.println("Enter Visa Status (valid/Invalid)");
        String Visa = sc.next().toLowerCase();

        if(Age <=0 )
        {
            System.out.println("Age can not be negative or 0");
            return;
        } else if (Age >=18 && Visa.equalsIgnoreCase("valid"))
        {
            System.out.println("You are eligible to travel");
        }else if(Age >=18 && Visa.equalsIgnoreCase("Invalid"))
        {
            System.out.println("You are not eligible to travel");
        }
        sc.close();

    }
}
