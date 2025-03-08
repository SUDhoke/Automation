package Task.Task_07_Feb;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        //what is prime number - 2,3,5,7,11,17
        //i/p -->  number
        //o/p --> prime / not prime

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i <= number/2; i++) {
                if (number % i == 0) {
                    System.out.println("not prime");
                }
                else {
                    System.out.println("prime");
                }
            }
        }
    }
}
