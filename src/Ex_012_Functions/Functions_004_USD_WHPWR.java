package Ex_012_Functions;

public class Functions_004_USD_WHPWR {
    public static void main(String[] args) {
        //user defined - type 2 -> without parameter and with return type
        //with return type means it is returning value and it is having data type
        //calling the function

       int s1 = greet_with_return_type_age();
        System.out.println(s1);

        //calling example 2 of type 2

        String str = greet_string_function_return_type();
        System.out.println(str);

        // calling the function - example 3

        float ft = greet_example3();
        System.out.println(ft);
    }

    static int greet_with_return_type_age()
    {
        return 18; // type 2
    }

    static String greet_string_function_return_type()
    {
        return "Hi this is type 2 and example 2";
    }

    static float greet_example3()
    {
        return 1.2f;
    }
}



