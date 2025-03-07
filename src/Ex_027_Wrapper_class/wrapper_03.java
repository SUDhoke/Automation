package Ex_027_Wrapper_class;

public class wrapper_03
{
    public static void main(String[] args) {
        int a =10;
        Integer b = a; //boxing
        System.out.println(b.intValue());
        System.out.println(b);

        Integer c = 200; //unboxing
        int d = c;
        System.out.println(d);
    }
}
