package Ex_028_Exception;

public class try_catch_Exception_08_Finally
{
    public static void main(String[] args) {
        int a = 1;
        int c = 0;

        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("exception message :"+e.getMessage());
        } finally {
            //finally block will execute anyhow
            System.out.println("Finally will execute anyhow");
        }
        System.out.println(c);
    }
}
