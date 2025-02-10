package Type_Casting;

public class Auto034_Type_casting_01
{
    public static void main(String[] args) {
        byte b = 10;

        int i = b;//int i = (int) b; // implicit casting //happens automatically by compiler

        System.out.println(i);
        
        short s = 450;
        long l = (long) s;
        System.out.println(l);
        
        float f = 32.25f;
        double d =(float) f;
        System.out.println(d);
    }
}
