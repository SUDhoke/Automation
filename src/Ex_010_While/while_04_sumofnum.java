package Ex_010_While;

import java.util.Scanner;

public class while_04_sumofnum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

        int numt = 1;
        int sum = 0;

        while (numt <= num) {
            sum = numt + sum;
            numt++;
        }
        System.out.println("sum :"+sum);
    }

}
