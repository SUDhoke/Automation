package Ex_028_Exception;

public class try_catch_Exception_10_mutiple_exc_in_one_catch
{
    public static void main(String[] args) {

        int b = 0; // if we provide 0 as i/p in command line -> ArithmeticException
        try {
            String s1 = args[0]; //ArrayIndexOutOfBoundsException
            int num = Integer.parseInt(s1); // if we applied the string i/p instead of int - NumberFormatException
            b = 100/num;
        } catch (NumberFormatException |ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception message : "+e.getMessage());
        } finally {
            System.out.println("finally block will execute anyhow");
        }
        System.out.println(b);

    }
}
