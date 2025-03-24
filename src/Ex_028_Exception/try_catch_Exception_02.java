package Ex_028_Exception;

public class try_catch_Exception_02
{
    public static void main(String[] args) {
        System.out.println("step 1");

        Integer a = null; //java.lang.ArithmeticException: / by zero
        try {
            a = 10/0;
        } catch (Exception e) {
//            e.printStackTrace(); // this will give full problem details with line no
            System.out.println(e.getMessage());//it will give message as / by zero
            System.out.println("can provide own message as well");
        }
        System.out.println("step 2");
    }
}
