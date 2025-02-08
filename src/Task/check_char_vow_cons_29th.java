package Task;

import java.util.Scanner;

public class check_char_vow_cons_29th
{
    public static void main(String[] args) {
        //step1 - i/p -> character

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("vowel");
        }else
        {
            System.out.println("consonant");
        }
        sc.close();
    }
}
