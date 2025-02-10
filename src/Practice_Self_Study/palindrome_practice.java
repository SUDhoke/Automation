package Practice_Self_Study;

import java.util.Scanner;

public class palindrome_practice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner class to take input form user
        System.out.println("Enter a String(name)");//statement to print the name
        String test=sc.nextLine();//in test string type variable value entered by user get stored

        int l = test.length();//this is length function to get the string length
        System.out.println(l);//print the string length

        test = test.toLowerCase();//function for lower case to make it case insesitive

        String rev = "";

        //for loop
        for(int i = 0; i<l; i++)
        {
            char ch = test.charAt(i);

            rev = test.charAt(i) + rev;
        }
        System.out.println(rev);
        if(test.equals(rev))
        {
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not palindrome");
        }
        sc.close();
    }

}
