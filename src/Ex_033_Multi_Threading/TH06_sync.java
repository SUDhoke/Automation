package Ex_033_Multi_Threading;

public class TH06_sync
{
    public static void main(String[] args) {

        SharedResource sr = new SharedResource();

        reader r1 = new reader(sr);
        r1.start();

        writer w1 = new writer(sr);
        w1.start();

    }
}
//class

class SharedResource
{
    int reader = 0;
    boolean iswriting = false;

    //reader method
   synchronized public void startReading()
    {
        if(iswriting==true)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            reader++; //increase reader count
        }
    }
    synchronized public void stopReading()
    {
       reader--;
       if(reader == 0)
       {
           notifyAll(); //it will notify writers that readers are 0 now
       }
    }

  synchronized  public void startwriting()
    {
        if(reader > 0 || iswriting == true)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            iswriting = true;
        }

    }

   synchronized public void stopwriting()
    {
        iswriting = false;
        notifyAll();
    }


}

class reader extends Thread{
    SharedResource resource;

    reader(SharedResource resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        resource.startReading();
        System.out.println(Thread.currentThread().getName()+ "is reading");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        resource.stopReading();
        System.out.println(Thread.currentThread().getName() +"finished reading");
    }
}
class writer extends Thread{
    SharedResource resource;

    writer(SharedResource resource)
    {
        this.resource = resource;
    }
    public void run()
    {
        resource.startwriting();
        System.out.println(Thread.currentThread().getName()+"Stars writing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       resource.stopwriting();
        System.out.println(Thread.currentThread().getName()+"finished writing");

    }
}