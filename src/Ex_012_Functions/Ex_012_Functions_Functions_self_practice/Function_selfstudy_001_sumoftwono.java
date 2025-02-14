package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

import java.util.Scanner;

public class Function_selfstudy_001_sumoftwono
{
    public static void main(String[] args) {
        //sum of two number using function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int sum_two_no = sum(num1,num2);
        System.out.println("sum of two number : "+sum_two_no);

    }

    //create a function -

    static int sum(int a, int b)
    {
        return a+b;
    }
}
