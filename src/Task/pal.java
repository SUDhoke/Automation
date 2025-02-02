package Task;

import java.util.Scanner;

public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        String reverse = ""; // Empty string to store reverse

        // Reverse the string manually using a loop
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        // Check if original and reversed strings are the same
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
