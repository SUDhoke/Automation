package Ex_004_Ternary_operator;

import java.util.Scanner;

public class POS_NEG
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        if(!sc.hasNextInt())
        {
            System.out.println("Int only");
        }
        int num = sc.nextInt();

        String result = (num > 0)?"positive":"Negative";
        System.out.println(result);
    }
}
