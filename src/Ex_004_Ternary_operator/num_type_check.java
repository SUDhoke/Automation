package Ex_004_Ternary_operator;

import java.util.Scanner;

public class num_type_check
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        String type = (num == 0)?"Zero":(num > 0)?"Positive":"Negative";
        System.out.println(type);
    }
}
