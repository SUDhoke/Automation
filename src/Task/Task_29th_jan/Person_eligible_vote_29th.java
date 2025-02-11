package Task.Task_29th_jan;

import java.util.Scanner;

public class Person_eligible_vote_29th
{
    public static void main(String[] args) {
        //step1 -> i/p -> int - age->
        //o/p -> string - eligible / not eligible

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        if(!sc.hasNextInt())
        {
            System.out.println("age can be in int only - char are not aloowed");
            return;
        }
        int age = sc.nextInt();
if(age == 0 || age >105)
{
    System.out.println("unsupported");
    return;
}
        if(age>=18)
        {
            System.out.println("eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }
        //ste4 - edge cases
        //1 - what if age is o or more than 110

        sc.close();

    }
}
