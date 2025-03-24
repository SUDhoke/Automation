package Ex_028_Exception;

public class try_multiple_catch_Exception_04
{
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
       //java.lang.ArithmeticException: / by zero
        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }

        //if we are not sure about the which type of exception then we can handel it by using multiple catch
        System.out.println(b);
    }
}
