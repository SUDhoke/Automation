package Task;

import java.util.Scanner;

public class Travel_visa_age
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //age as i/p

        System.out.println("Enter age ");
        int age = sc.nextInt();

        if(age <=0)
        {
            System.out.println("age can not be negative or 0");
            return;
        }

        System.out.println("Enter visa status");
        boolean visa_status = sc.nextBoolean();


        if(age>=18 && visa_status == true)
        {
            System.out.println("You cam travel");
        }else
        {
            System.out.println("You are not eligible to travel");
        }





    }


}
