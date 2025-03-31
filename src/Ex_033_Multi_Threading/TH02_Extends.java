package Ex_033_Multi_Threading;

public class TH02_Extends
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread_01");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("Thread_02");
        t2.start();

    }
}
class MyThread extends Thread
{
    public void run()  {
        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}