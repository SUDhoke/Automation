package Ex_011_Do_While;

import java.util.Scanner;

public class Do_While_004_Ip_number
{
    public static void main(String[] args) {

        //ask user to i/p a number
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        do {
            System.out.println("Enter a number");
            num = sc.nextInt();
            if(num >=0)
            {
                sum = sum +num;
            }

        }while(num >=0);

        System.out.println(sum);







    }
}
