package Ex_011_Do_While;

import java.util.Scanner;

public class Do_while_009
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i <= num);
    }
}
