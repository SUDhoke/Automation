package Ex_028_Exception;

public class try_catch_Exception_03
{
    public static void main(String[] args) {
        String str = null;
        System.out.println("start");
        try {
            str.trim();//java.lang.NullPointerException: Cannot invoke "String.trim()" because "str" is null
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
