package Ex_015_String_Functions;

import java.util.Scanner;

public class StrinBuilder_03_palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        String compare = s;
        StringBuilder str = new StringBuilder(s);

        System.out.println(s);

        str.reverse();
        System.out.println(str);

        if (str.toString().equals(compare))
        {
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
