package Operator;

public class Auto029_All_operator {
    public static void main(String[] args) {


        // Assignment operator
        System.out.println("\nAssignment operator");
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        // unary operator
        int a1 = -10;
        System.out.println("\nUnary operator");
        System.out.println(a1);

        // arithmetic operator
        System.out.println("\nArithmetic operator");
        System.out.println(a + a); // arithmetic operator
        System.out.println(a - a);
        System.out.println(a * a);
        System.out.println(a / a);
        System.out.println(a % a);


        //logical operator

        System.out.println("\nLogical operator");
        System.out.println(!(a < b ));
        System.out.println( a < b || b < a);
        System.out.println( a < b && b < a);


        // Relational operator

        System.out.println("\nRelational Operator");
        System.out.println( a > b );
        System.out.println( a < b );
        System.out.println( a>= b );
        System.out.println( a <=b );
        System.out.println( a == b );
        System.out.println( a != b );

        // Compound assignment operator
        System.out.println("\nCompound assignment operator");
        int age = 12;
        int age1 = 12;
        //age = age +12;
       // age1 = age+=12;

        //age = age - 10;
        //age1 = age -=10;

//        age = age * 10;
//        age1 = age1*=10;

        age = age/8;
        age1 = age1/=8;
        System.out.println(age);
        System.out.println(age1);

        // new operator
        System.out.println("\nNew operator");
        String s1 = new String("Sonali_Dhoke");
        System.out.println(s1);

//        //example two
//        Auto029_All_operator all = new Auto029_All_operator();
//      for creating a new object and allocated memory for them new operator is used
//        System.out.println(all);


    Auto029_All_operator all = new Auto029_All_operator();
//
       all.test();

//         test();


    }

    void test ()
    {
        String S2 = new String("testexample");
        System.out.println(S2);




    }
}


