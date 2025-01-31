package Increment_decrementOP;

public class DEcrement
{
    public static void main(String[] args) {
        int a = 15;

        System.out.println(a--);
        System.out.println(a);
        //Post decremented value is assigned first and then decremented

        // expression and result table
        //Line no | Expression | var val
        //6 | NA| 15
        //8 |expression -> a-- -> 15 | a->14
        //9 | NA | 15

    }
}
