package Operator;

public class Auto024_concatenation_operator {
    public static void main(String[] args) {

        //Example 1
        int a = 10;
        int b = 20;

        System.out.println(a + b); // for the int value + act as a arithmetic operator
        // Example two
        String S1 = "Sonali";
        String S2 = "Dhoke";
        System.out.println(S1 + "\t" + S2); //for String it concatenates /Attach the two strings

//        example three

        System.out.println(a + b + S1 + S2);
//        if take integer variables first then it acts as a arithmetic then concatenates String

//        Example three
        System.out.println(S1 + " " +S2 + " "+ a + "\t" +b );
    }
}
