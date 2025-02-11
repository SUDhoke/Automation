package Task.Task_19th_jan;

public class Increment_decrement_task2
{
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        //9 | NA | a->20
        //10 | Ex1 -> --a -> 19 | a -> 19 (+)
        //10 | Ex2 -> a++ -> 19 | a -> 20
        //10 | Ex3 -> a-- -> 20| a-> 19
    }
}
