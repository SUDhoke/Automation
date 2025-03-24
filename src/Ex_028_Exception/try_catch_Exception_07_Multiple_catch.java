package Ex_028_Exception;

public class try_catch_Exception_07_Multiple_catch
{
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        String name = null;
        try {
            b = 100/a;
            name = null;
            name.trim();
        } catch (ArithmeticException e) {

            System.out.println("Arithmetic exception :"+e.getMessage());

        }catch(NullPointerException e)
        {
            System.out.println("NullpointerException :"+e.getMessage());
        }
        System.out.println(b);
        System.out.println(name);
    }
}
