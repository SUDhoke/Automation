package Ternary_operator;

import java.util.Scanner;

public class Auto039_TP
{
    public static void main(String[] args) {

        int age;
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter age");
        if(sc.hasNextInt())
        {
        age = sc.nextInt();

        if (age <18)
        {
            System.out.println("invalid age format for voting");
            return;
        }
        String result = age >=18 ? " can vote " : " can not vote ";
        System.out.println(result);

        sc.close();
    }
}
}
