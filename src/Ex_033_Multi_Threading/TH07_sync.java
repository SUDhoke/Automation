package Ex_033_Multi_Threading;

import kotlin.concurrent.ThreadsKt;

public class TH07_sync
{
    public static void main(String[] args) {
        BankAccount icici = new BankAccount(10000);

       users_deposit ud1 =  new users_deposit(icici,1000);
       ud1.start();

       user_withdraw ud2 = new user_withdraw(icici,2000);
       ud2.start();
    }
}
//shared bank account is accessed by multiple users who perform deposits and withdrawals
class BankAccount
{
    float balance;

    BankAccount(float balance)
    {
        this.balance=balance;
    }
    //method creation
   public void deposit(float amt)
    {
        balance = balance + amt;
        System.out.println(Thread.currentThread().getName()+ "\tDeposited amount\t"+balance);
    }

    public void withdraw(float amt)
    {
        if(amt <= 0)
        {
            System.out.println("amount can not get withdraw :");
        }else if(amt <=balance) {
            balance = balance - amt;
            System.out.println(Thread.currentThread().getName()+"\tWithdraw amount : "+amt+"\ttotal balance remaining : "+balance);
        }else
        {
            System.out.println(Thread.currentThread().getName()+"insufficient balance : "+amt);
        }
    }
}

class users_deposit extends Thread{
    BankAccount bk;
    float amount;

    users_deposit(BankAccount bk,float  amount)
    {
        this.bk=bk;
        this.amount = amount;
    }
    public void run()
    {
       bk.deposit(amount);
    }

}
class user_withdraw extends Thread
{
    BankAccount bk;
    float amount;

    public user_withdraw(BankAccount bk, float amount) {
        this.bk = bk;
        this.amount = amount;
    }
    public void run()
    {
        bk.withdraw(amount);
    }
}