package Ex_033_Multi_Threading;

public class TH01_main
{
    public static void main(String[] args) throws Exception
    {
//
//        Thread t1 = new Thread();
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        }
    }
}
