package Task;

import java.util.Scanner;

public class check_char_alpha_30th
{
    public static void main(String[] args) {
        //step1- i/p - character ch ->
        //o/p -> alpahabet or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);

        if(ch >='A' && ch <='Z' || ch >='a' && ch<='z')
        {
            System.out.println("Alphabet");
        }else {
            System.out.println("not alphabet");
        }
    }
}
