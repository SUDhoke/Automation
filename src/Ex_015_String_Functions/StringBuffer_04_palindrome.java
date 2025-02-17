package Ex_015_String_Functions;

import java.util.Scanner;

public class StringBuffer_04_palindrome
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine().toLowerCase();

        StringBuffer buffer = new StringBuffer(str);

        buffer.reverse();
        System.out.println(buffer);

        if(str.equals(buffer.toString()))
        {
            System.out.println("palindrome");
        }else
        {
            System.out.println("Not a palindrome ");
        }
    }
}
