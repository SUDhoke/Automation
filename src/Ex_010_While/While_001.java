package Ex_010_While;

import java.util.Scanner;

public class While_001
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        int i = 1;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}
