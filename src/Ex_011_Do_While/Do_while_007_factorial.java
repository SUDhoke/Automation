package Ex_011_Do_While;

import java.util.Scanner;

public class Do_while_007_factorial
{
    public static void main(String[] args) {
        //step -> i/p -> a number
        //factorial = 5 * 4 * 3 * 2 * 1 = i
        Scanner sc = new Scanner(System.in);
        System.out.println("number fact");
        int number = sc.nextInt();

        int fact = 1;
        int i = 1;
        //logic
        do{
            fact = fact * i;
            i++;
        }while(i <= number);
        System.out.println(fact);

    }
}
