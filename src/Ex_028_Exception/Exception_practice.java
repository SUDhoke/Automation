package Ex_028_Exception;

public class Exception_practice
{
    public static void main(String[] args) {

        Integer[] array = null;
        Integer sum = 0;

        try {
            for (int i = 0; i < array.length; i++)
            {
                //NullPointerException

             sum = sum + array[i];
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sum);
    }
}
