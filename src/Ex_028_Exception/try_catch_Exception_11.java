package Ex_028_Exception;

public class try_catch_Exception_11
{
    public static void main(String[] args) {
        final double PI  = 3.14;
        int a = 0;
        int x  = 0;

        //unchecked exceptions
        try {
            x = 10/a;
        } catch (Exception e) {
            System.out.println("exception message :"+e.getMessage());
        } finally {
            System.out.println("this block will executed anyhow");
        }
        System.out.println(x);
    }
}
