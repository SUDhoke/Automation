package Ex_028_Exception;

public class try_catch_Exception_05_good_QA
{
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            //use when we have known about the .
            b = 100/c;//ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
