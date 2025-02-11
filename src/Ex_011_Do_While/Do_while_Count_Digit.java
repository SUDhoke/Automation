package Ex_011_Do_While;

import java.util.Scanner;

public class Do_while_Count_Digit
{
    public static void main(String[] args) {

        //ex -123 - no of digit is - 3
        //step 1 - i/p a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();

        //step 2 -> o/p -> num of digit -> nod ?
        int nod = 0;
        do {
            num = num /10;
            nod++;

        }while(num != 0);
        System.out.println(nod);
    }
}
