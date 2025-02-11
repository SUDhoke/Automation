package Task.Task_25th_jan;

import java.util.Scanner;

public class Assignment_Count_V_C_String {
    public static void main(String[] args) {

        //step 1 - find out i/p and o/p
        //i/p -> String -> pramod

        String str ="pramod";

        int len = str.length();
        System.out.println(len);

        //o/p -> count of vowels -> int v;
        int v = 0; // local variable must have value
        //o/p -> count of con -> int c
        int c = 0;

        //step 2 -> rough logic
        //need char one by one from a string

        for (int i = 0; i < len-1; i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                v++;
            } else
            {
                c++;
            }
        }

            System.out.println(v);
            System.out.println(c);

    }

    public static class check_char_V_C
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a char");
            String str = sc.next();
            str = str.toLowerCase();

            char ch = str.charAt(0);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println("v");
            }else {
                System.out.println("c");
            }
            sc.close();
        }
    }
}
