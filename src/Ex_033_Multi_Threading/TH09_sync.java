package Ex_033_Multi_Threading;

public class TH09_sync
{
    public static void main(String[] args) {

        numbers_print np1 = new numbers_print(6);


        print_data_related_to_numbers thread1 = new print_data_related_to_numbers(np1);
        thread1.setName("Thread1 ");
        thread1.start();

        print_data_related_to_numbers thread2 = new print_data_related_to_numbers(np1);
        thread2.setName("Thread2 ");
        thread2.start();

    }
}
//shared class
class numbers_print
{
    int numbers;
    numbers_print(int numbers)
    {
        this.numbers = numbers;
    }
    public synchronized void even_number_print()  {
        for(int i = 0; i<=numbers; i++)
        {

            if(i%2==0)
            {

                System.out.println(Thread.currentThread().getName()+" Even number :"+i);

            }
        }
    }
    public synchronized void odd_number_print()
    {
        for(int i =0; i<=numbers; i++)
        {

            if(i%2!=0)
            {

                System.out.println(Thread.currentThread().getName()+" odd numbers :"+i);
            }
        }
    }
}

class print_data_related_to_numbers extends Thread{

    numbers_print np;

    print_data_related_to_numbers(numbers_print np)
    {
        this.np = np;
    }
    public void run()
    {
        try {
            np.even_number_print();
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        np.odd_number_print();

    }
}