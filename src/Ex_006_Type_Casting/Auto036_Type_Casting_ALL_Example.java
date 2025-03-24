package Ex_006_Type_Casting;

public class Auto036_Type_Casting_ALL_Example
{
    public static void main(String[] args)
    {
        byte b = 127;
        int  a = 1236547890;

        // implicit - widening

        int a1  = a + b; //happens automatically
        System.out.println(a1);

        //implicit narrowing - not possible must perform by user

        byte b1 = (byte) ((byte)a + b);
        System.out.println(b1);

        // explicit narrowing

        byte b2 = (byte) ((byte)b + (byte) a);
        System.out.println(b2);

        //explicit widening

        int a2 = a +b;
        System.out.println(a2);

    }
}
