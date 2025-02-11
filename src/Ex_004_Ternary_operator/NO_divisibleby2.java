package Ex_004_Ternary_operator;

import java.util.Scanner;

public class NO_divisibleby2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number in Integer format");
        int num = sc.nextInt();

        String Div = (num%2==0)?"divisible by 2":"not divisible by 2";
        System.out.println(Div);
    }
}
