package Ex_030_Generics;

public class Generic_1
{
    public static void main(String[] args) {
        temp(12,13);
        temp("sonali","Dhoke");

        System.out.println();
        test(1,2,3);
        test("Sonali"," Uttamrao"," Dhoke");


        System.out.println();
        generic_1("sona"," tester");
        generic_1(2.5f,35f);
        generic_1(25.1D,25.2D);

    }

    public static <T> T temp(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <sona> sona generic_1(sona val1, sona val2)
    {
        System.out.println(""+val1+val2);
        return null;
    }

    public static <T> T test(T v1, T v2, T v3)
    {
        System.out.println("Data :"+v1+v2+v3);
        return null;
    }
}
