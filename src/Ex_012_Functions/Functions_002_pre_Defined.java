package Ex_012_Functions;

import java.util.Scanner;



public class Functions_002_pre_Defined
{
    public static void main(String[] args) {

//        Math.max(45, 56);
//        Integer.parseInt("3");
//
//        String.valueOf(2);
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();

        //parseInt practice
        //example 1 ->
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // Example 2 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num1 = sc.nextLine();

        int C_str_num = Integer.parseInt(num1);
        System.out.println(C_str_num);
    }
}
