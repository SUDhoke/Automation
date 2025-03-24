package Ex_028_Exception;

public class try_catch_Exception_06
{
    public static void main(String[] args) {
        int a = 0;
        int c = 0;

        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println("Message of Exception :"+e.getMessage());
//            e.printStackTrace();
        }
        System.out.println(c);
    }
}
