package Ex_033_Multi_Threading;

public class TH03_Implemets
{
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread1 th2 = new MyThread1();
//      th1.start(); //we can not use start method directly if we are implementing runnable interface
        //create the object of thread class and pass as argument reference of a Mythread1

        Thread actual_response1 = new Thread(th1);
        Thread actual_response2 = new Thread(th2);
        actual_response1.setName("Thread01_implements_runnable");
        actual_response1.start();
        actual_response2.setName("Thread02_implements_runnable");
        actual_response2.start();


    }
}
class MyThread1 implements Runnable
{
    public void run()
    {
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