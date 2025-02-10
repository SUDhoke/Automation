package Ternary_operator;

import java.util.Scanner;

public class Auto041_nested_ternary_greater_number
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter a number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter a number 3");
        int num3 = sc.nextInt();

        String result = (num1 >= num2)? ((num1>=num3)? "num1":"num3") : ((num2>=num3)?"num2":"Num3");
        System.out.println("Largest Number" +result);
    }
}
