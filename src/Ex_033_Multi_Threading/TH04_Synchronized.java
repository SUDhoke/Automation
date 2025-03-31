package Ex_033_Multi_Threading;

public class TH04_Synchronized
{
    public static void main(String[] args) {
        th1 test1 = new th1();
        test1.setName("th1 class thread");
        test1.start();

        th2 test2 = new th2();
        test2.setName("th2 class thread");
        test2.start();

    }
}
//class table - which has logic for table
class Table
{
    //method created for table creation
  synchronized  public static void create_table(int number)
    {
        for (int i = 1; i <=10; i++) {
            System.out.println(number+" * "+ i + " = " +(number * i ));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class th1 extends Thread
{
    Table t;

     public void run()
    {
        t.create_table(5);
    }
}
//second class for thread
class th2 extends Thread
{
    Table t;
     public void run()
    {
        t.create_table(7);
    }
}
