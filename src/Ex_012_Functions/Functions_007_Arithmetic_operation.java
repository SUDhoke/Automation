package Ex_012_Functions;

import java.util.Scanner;

public class Functions_007_Arithmetic_operation
{
    public static void main(String[] args)
    {
        //create function sub,sum,mul,and div,mod
        //with parameter a,b(user input)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        //calling the function
        int sum_c = sum(num1,num2);
        System.out.println(sum_c);
        int sub_c = sub(num1, num2);
        System.out.println(sub_c);
        int mul_c = mul(num1,num2);
        System.out.println(mul_c);
    }

    static int sum(int num1,int num2)
    {
        return num1+num2;
    }

    static int sub(int num1, int num2)
    {
        return num1 - num2;
    }
    static int mul(int num1 , int n2)
    {
        return num1 * n2;
    }
}
