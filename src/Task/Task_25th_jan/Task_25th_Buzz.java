package Task.Task_25th_jan;

public class Task_25th_Buzz
{
    public static void main(String[] args) {

        //step 1 - i/p -> no 1 to 100
        // multiple of 3 -
        // multiple of 3 and 5
        //o/p - print -> Fizz (3)
        //o/p - pring -> fizz Buzz ( 3 and 5)

        for ( int i = 1; i <=100; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz ->"+i);
            } else if (i%5==0)
            {
                System.out.println("Buzz ->" +i);
            } else if (i%3==0 )
            {
                System.out.println("Fizz ->"+i);

            }
        }
    }

}
