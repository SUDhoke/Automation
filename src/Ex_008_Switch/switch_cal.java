package Ex_008_Switch;

import java.util.Scanner;

public class switch_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num1");
        int num1 = sc.nextInt();

        System.out.println("enter num2");
        int num2 = sc.nextInt();

        System.out.println("enter operator +,-,*,/ are allowed to enter only ");
        char ch = sc.next().charAt(0);
        int result = 0;
        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
        }
            System.out.println(result);



    }
}
