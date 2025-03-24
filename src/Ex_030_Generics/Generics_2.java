package Ex_030_Generics;

public class Generics_2
{
    public static void main(String[] args) {

        Temp(10,20);
        Temp("Sonali", " Dhoke");
    }

    public static <Generic> Generic Temp(Generic a, Generic b)

    {
        System.out.println("Addition : " +a+b);
        return null;
    }
}
