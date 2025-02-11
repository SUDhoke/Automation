package Task.Task_30th_jan;

import java.util.Scanner;

public class ATM_With_simulation
{
    public static void main(String[] args) {
        //step 1 ->i/p -> account balance 10000 final
        final int account_balance = 10000;
        //step1 ->i/p -> withdrawal amount taken by user i/p
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        int w_amt = sc.nextInt();

        //step 2 - logic building / writing logic

        //check withrawal condition
        if(w_amt<=0 || w_amt <100)
        {
            System.out.println("Error : the amount should be greater than 0 and more than 100 ");
        }
        else if (w_amt >110000)
        {
            System.out.println("Error : The amount should not exceed the account balance");
        }
        else if (w_amt%100!=0) //common ATM rule - multiple of 100
        {
            System.out.println("Error : The amount should be multiple of 100");
        }else
        {
            int r_total = account_balance - w_amt;
            System.out.println("L bank_balance : "+r_total);
        }



    }
}
