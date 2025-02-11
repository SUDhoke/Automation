package Task.Task_19th_jan;

import java.util.Scanner;

public class ternary_v_c
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch2 = sc.next().toUpperCase().charAt(0);

        String result = (ch2 =='A')||(ch2=='E')||(ch2 == 'I')||(ch2=='O')||(ch2=='U')?"vowel":"Consonant";
        System.out.println(result);






    }
}
