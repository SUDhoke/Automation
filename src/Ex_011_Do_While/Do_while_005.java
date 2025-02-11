package Ex_011_Do_While;

import java.util.Scanner;

public class Do_while_005
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a num");
        int num = sc.nextInt();

        do{
            System.out.println(num);
            num--;
        }while(num>=1);
    }
}
