package Ex_004_Ternary_operator;

import java.util.Scanner;

public class AUto043_EVEN_ODD
{
    public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int n1 = sc.nextInt();

    String result = (n1%2==0)?"Even":"odd";
    System.out.println("result :" +result);
}
}
