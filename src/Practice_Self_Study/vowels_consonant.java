package Practice_Self_Study;

import java.util.Scanner;

public class vowels_consonant
{
    public static void main(String[] args)
    {
        //step1 -> find out the entered character is v c
        // i/p -> char
        //o/p -> string v / c

        Scanner sc = new Scanner(System.in);// to take user i/p
        System.out.println(" enter a character(string)");//print
        String str = sc.next();

        str = str.toLowerCase();//solve the case sensitive

        char ch = str.charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
           String result = "vowels";
            System.out.println(result);
        }else {
            String result1 ="consonant";
            System.out.println(result1);
        }

        sc.close();
    }
}
