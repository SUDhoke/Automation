package Ex_007_IF_Condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class if_else_largestofthree 
{
    public static void main(String[] args) {
        //step1 - i/p -> int -> num1,num2 and num3 required
        //o/p - String - largest number
        Scanner sc = new Scanner(System.in);
try {


    System.out.println("Enter number 1");
    int num1 = sc.nextInt();

    System.out.println("Enter number 2");
    int num2 = sc.nextInt();

    System.out.println("Enter number 3");

    int num3 = sc.nextInt();

    //rough logic / write logic
    if (num1 > num2 && num1 > num3) {
        System.out.println("num1 is greater");
    } else if (num2 > num3 && num2 > num3) {
        System.out.println("num2 is greater");
    } else if (num1 == num2 || num2 == num3) {
        System.out.println("all numbers are Equal");
    } else {
        System.out.println("num3 is greater");
    }
}catch (InputMismatchException e)
{
    System.out.println("invalid input");
}


    }
}
