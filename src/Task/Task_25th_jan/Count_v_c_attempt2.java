package Task.Task_25th_jan;

import java.util.Scanner;

public class Count_v_c_attempt2
{
    public static void main(String[] args) {
        //step 1 -> string -> i/p scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.next();

        s1 = s1.toLowerCase();

        //o/p -> two variable required to count v and consonant
        int V = 0;
        int c = 0;

        for ( int i = 0; i<s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                V++;
            }else
            {
                c++;
            }

        }

        System.out.println("vowels count :" +V);
        System.out.println("Consonant count : "+c);
    }

    public static class POS_NEG_IF
    {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            if(!sc.hasNextInt())
            {
                System.out.println("only int are allowed ");
                return;
            }
            int number = sc.nextInt();

            //logic number > 0 -> positive
            //number < 0 then number is negative

            if (number >= 0)
            {
                System.out.println("Positive");
            }
            else {
                System.out.println("negative");
            }

        }
    }
}
