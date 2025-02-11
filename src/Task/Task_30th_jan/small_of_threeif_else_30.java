package Task.Task_30th_jan;

import java.util.Scanner;

public class small_of_threeif_else_30
{
    public static void main(String[] args) {
        //step1 - i/p & o/p
        //i/p -> n1 , n2 n2
        //o/p -> smallest of three

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("enter n2");
        int n2 = sc.nextInt();
        System.out.println("enter n3");
        int n3=sc.nextInt();

        //step2 - logic building
        //n1 < n2 -> n1 < n3 -> n1 is small
        // n2 < n3 -> n2 is small else n3 is small

        // step 3 - write logic

        if(n1 < n2 && n1 < n3)
        {
            System.out.println("n1 is small : "+n1);
        } else if (n2 < n3)
        {
            System.out.println("n2 is small : "+n2);
        }else {
            System.out.println("n3 is small : "+n3);
        }
    }
}
