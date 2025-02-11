package Ex_005_Increment_decrementOP;

public class Practice
{
    public static void main(String[] args) {
        int a1 =100;
        System.out.println(a1++ +  ++a1 + a1++);
        System.out.println(a1);

        // 6 | NA | a1 = 100
        // 7 | ex1 ->a1++ -> 100 | a1 -> 101 (+)
        //7 | ex2 -> ++a1 -> 102 | a1 -> 102 (+)
        //7 | ex3 -> a1++ -> 102 | a1 -> 103

        //decrement

        int a = 20;
        System.out.println(--a + a-- - a--);
        System.out.println(a);
        //17 | NA| a -> 20
        //18 | ex1 ->--a -> 19 | a -> 19 (+)
        //18 | ex2->a---> 19 | a -> 18 (-)
        //18 |ex3 -> a-- -> 18 | a-> 17

    }
}
