package Ex_028_Exception;

public class Exception_01
{
    public static void main(String[] args) {
        System.out.println("......Start the program......");

        String ip = args[0];//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

        int a = Integer.parseInt(ip);//java.lang.NumberFormatException: Cannot parse null string

        int b = 100/a;//java.lang.ArithmeticException: / by zero

        System.out.println(b);
        System.out.println("......End of the program.......");
    }
}
