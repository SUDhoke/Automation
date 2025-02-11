package Ex_011_Do_While;

import java.util.Scanner;

public class Do_While_006
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
        int i = 2;
        System.out.println("Even number 1 (upto num)\t" + num + ":");
        do{
            if(i > num )
            {
                break;
            }
            System.out.println(i + " ");
            i=i+2;
        }while(i <= num);
    }
}
