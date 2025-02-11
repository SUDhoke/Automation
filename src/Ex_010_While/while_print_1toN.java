package Ex_010_While;

import java.util.Scanner;

public class while_print_1toN
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int num = sc.nextInt();

        int i = 1;

        while(i <= num )
        {
            System.out.println(num);
            num--;
        }
    }
}
