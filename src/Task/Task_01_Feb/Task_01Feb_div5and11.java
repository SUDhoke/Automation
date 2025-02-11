package Task.Task_01_Feb;

import java.util.Scanner;

public class Task_01Feb_div5and11
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0)
        {
            System.out.println("Number Divisible by 5 and 11 : " +num);
        }else {
            System.out.println("Not divisible by 5 and 11 :"+num);
        }
        sc.close();
    }
}
