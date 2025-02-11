package Ex_005_Increment_decrementOP;

public class Incremane_prefix
{
    public static void main(String[] args) {
        int a = 12;
        System.out.println(++a);
        System.out.println(a);
        // prefix -> value get incremented first then assigned
        // expression and result table
        // line No | Expression | var value
        // 6 | NA | 12
        //7 | ++a -> 13 | 13
        //8 |NA|13
    }
}
