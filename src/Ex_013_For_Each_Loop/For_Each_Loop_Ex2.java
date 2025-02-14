package Ex_013_For_Each_Loop;

import java.util.Scanner;

public class For_Each_Loop_Ex2
{
    public static void main(String[] args) {
//
//        String str = "Hello";
//        int count = 0;
//        char tar = 'l';
//
//        for(char s1 : str.toCharArray())
//        {
//            System.out.println(s1);
//            if(s1 == tar)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next().toLowerCase();

        System.out.println("Enter a character : ");
        char target_char = sc.next().charAt(0);

        int count = 0;

        for(char s1 : str.toCharArray())
        {
            if(s1 == target_char )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
