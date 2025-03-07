package Ex_027_Wrapper_class;

public class wrapper_04
{
    public static void main(String[] args) {
        String num = "10";
        int aaa = 10;

        //String -> wrapper conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a);

        //string to primitive
        int a2 = Integer.parseInt(num);
        System.out.println(a2);

        Integer a3 = Integer.valueOf(num);
        System.out.println(a3);
    }
}
