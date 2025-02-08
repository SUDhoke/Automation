package Task;

import java.util.Scanner;

public class EVen_odd_If_else_task_29
{
    public static void main(String[] args) {
        //step 1 - i/p - number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(!sc.hasNextInt())
        {
            System.out.println("only integer");
            return;
        }
        int num = sc.nextInt();

        // step 2 - logic building/rough logic
        //even number = num%2==0 else odd

        //step 3 - write logic

        if(num%2==0)
        {
            System.out.println("even");
        }else
        {
            System.out.println("odd");
        }
    }
}
