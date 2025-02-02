package Task;

import java.util.Scanner;

public class Count_vow_cos {
    public static void main(String[] args) {

        //i/p -> String
        //o/p -> count consonants and vowels
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.next();
        name = name.toUpperCase();

        int Vow_count = 0;
        int con_count = 0;

        for (int i = 0; i < name.length() ; i++) {
            char ch = name.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                Vow_count++;
            } else {
                con_count++;
            }
        }

        System.out.println("vowels :"  +Vow_count);
        System.out.println("Consonant : " + con_count);
        sc.close();
    }
}
