package Ex_004_Ternary_operator;

import java.util.Scanner;

public class Auto042_max_of_two_no
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1");
        int n1 = sc.nextInt();

        System.out.println("enter number 2");
        int n2 = sc.nextInt();

        String largest = (n1>n2)?"n1 is large" : "n2 is large";
        System.out.println(largest);
    }
}
