package Ex_015_String_Functions;

import java.util.Scanner;

public class String_func_01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        //1.length function - returns the length of the string
        System.out.println(str.length());

        //2.charAt(index)- return a character at specified index
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));



    }
}
