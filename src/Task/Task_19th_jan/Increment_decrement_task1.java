package Task.Task_19th_jan;

public class Increment_decrement_task1
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //line No | exp | res
        // 6 |NA | a-> 10
        //7 | ex1 -> ++a -> 11 | a-> 11
        //7 | ex2 -> a++ -> 11 | a-> 12
        //7 |ex3 -> a++ -> 12 | a-> 13
    }
}
