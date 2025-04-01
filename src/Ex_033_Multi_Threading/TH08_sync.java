package Ex_033_Multi_Threading;

public class TH08_sync
{
    public static void main(String[] args) {
        NumberPrinter p1= new NumberPrinter(3);

        printThread t1 = new printThread(p1);
        t1.start();
        printThread t2 = new printThread(p1);
        t2.start();
    }
}
class NumberPrinter
{
    int number = 1;
    int max;
    NumberPrinter(int max)
    {
        this.max=max;

    }
    public void print_number()
    {
        if(number <= max)
        {
            System.out.println(Thread.currentThread().getName()+" printed "+number);
            number++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class printThread extends Thread{
    NumberPrinter print;

    printThread(NumberPrinter print)
    {
        this.print=print;
    }
    public void run()
    {
        print.print_number();
    }
}