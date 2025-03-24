package Ex_028_Exception;

public class Exception_practice_03
{
    public static void main(String[] args) {

        Integer [] numbers = {10,20,30};

        System.out.println(numbers[0]);
        try {
            System.out.println(numbers[3]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this block will get executed anyhow");
        }
    }
}
