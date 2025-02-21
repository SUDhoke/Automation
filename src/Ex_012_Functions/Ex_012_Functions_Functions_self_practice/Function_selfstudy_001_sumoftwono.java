package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

import java.util.Scanner;

public class Function_selfstudy_001_sumoftwono
{
    public static void main(String[] args) {
        //sum of two number using function

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();

        System.out.println("enter num2");
        int b = sc.nextInt();

        //calling the function - for return type need to declare
        int sum_two = sum(a,b);
        System.out.println("sum of two number :" +sum_two);

    }

    //create a function -

    static int sum (int num1, int num2)
    {
        return num1 + num2;
    }

}
