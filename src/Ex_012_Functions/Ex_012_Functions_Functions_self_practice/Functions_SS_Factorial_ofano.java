package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

public class Functions_SS_Factorial_ofano
{
    public static void main(String[] args) {
        //factorial of a num - ex 3! = 3*2*1 = 6
        //i/p -> a number in int
        //o/p -> factorial - store -> int fact
        //calling a function

        int fact_result = factorial(4);
        System.out.println(fact_result);

    }
    static int factorial(int a)
    {
        int fact = 1;
        while(a > 1)
        {
            fact = fact * a;
            a--;
        }
        return fact;
    }
}
