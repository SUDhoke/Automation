package Increment_decrementOP;

public class INC_05 {
    public static void main(String[] args) {


        int a = 20;
        System.out.println(a++ + a);
        //line no | expression | value
        // 7 | NA | a -> 20
        //8 | a++ -> 20 | a-> 21


        int a1 = 10;
        System.out.println(a1++ + ++a1);
        //line no |expression | value
        //14 | NA | a1-> 10
        //15 | exp1 -> a1++ -> 10 | a1-> 11
        // +
        //15 |exp 2 -> ++a1 -> 12 | a1-> 12

        int b = 20;
        System.out.println(++b + ++b);
        System.out.println(b);
        //line no | expression | value
        //22 | NA | b->20
        //23 |exp1 -> ++b -> 21 -> |b-> 21
        //+
        // 23 | exp2 ->++b -> 22 | b-> 22
    }
}
