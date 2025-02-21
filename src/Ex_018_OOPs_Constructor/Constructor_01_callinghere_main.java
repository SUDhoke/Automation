package Ex_018_OOPs_Constructor;

public class Constructor_01_callinghere_main
{
    public static void main(String[] args) {

        Constructor_01 c1 = new Constructor_01();
        c1.name = "Sonali";
        System.out.println(c1.name);
        c1.Model ="Dhoke";
        System.out.println(c1.Model);

        System.out.println("..........");

        Constructor_01 c2 = new Constructor_01();
        c2.year = 2025;
        System.out.println(c2.year);

    }
}
