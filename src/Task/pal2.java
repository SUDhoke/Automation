package Task;

import java.util.Scanner;

public class pal2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int length = str.length();
        System.out.println(length);

        String reverse = "";

        for (int i=0; i<str.length(); i++)
        {

            reverse = str.charAt(i)+reverse;
        }
        System.out.println(reverse);
        if(str.equals(reverse))
        {
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
