package Ternary_operator;

import java.util.Scanner;

public class INC_DEC_Practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        System.out.println(a++ - ++a + a++ - ++a + a++);
        System.out.println(a);

        //line no | expression | value
        //12 | exp1 -> a++ -> 10 | a-> 11
        //12 | exp2 -> ++a -> 12 | a-> 12
        //12 | exp3 -> a++ -> 12 | a-> 13
        //12 | exp4 -> ++a -> 14 | a-> 14
        //12 | exp5 -> a++ -> 14 | a-> 15
    }
}
