package Task;

import java.util.Scanner;

public class palindrome_number
{
    public static void main(String[] args) {
        //step1 -> i/p - number
        //o/p -> number is palindrome / not palindrome

        Scanner sc = new Scanner(System.in); // i/p using scanner
        System.out.println("Enter a Integer number");
        int num = sc.nextInt();

        int original_num = num;

        //step 2 - logic building
        //121 - > reverse the number and check both numbers
        int reverse = 0;
        while(num > 0) {
            int Last_d = num % 10;
            System.out.println(Last_d);
            reverse = reverse * 10 + Last_d ;
            num = num/10;

        }
        System.out.println(reverse);
        if(reverse ==original_num)
        {
            System.out.println("number is palindrome");
        }else
        {
            System.out.println("number is not palindrome");
        }


    }
}
