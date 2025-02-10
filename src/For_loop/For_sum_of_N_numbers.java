package For_loop;

import java.util.Scanner;

public class For_sum_of_N_numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;

        for (int num1 = 1; num1<=num; num1++)
        {
            sum = num1 + sum;
        }
        System.out.println(sum);
    }
}
