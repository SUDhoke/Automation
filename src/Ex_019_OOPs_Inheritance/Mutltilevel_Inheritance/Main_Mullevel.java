package Ex_019_OOPs_Inheritance.Mutltilevel_Inheritance;

public class Main_Mullevel
{
    public static void main(String[] args) {

        Son s1 = new Son();
        Father f1 = new Father();
        GrandFather gf1 = new GrandFather();

        //son can access Gradfather as well as father - A and B
        System.out.println(s1.gf);
        System.out.println(s1.Father);
        s1.BHK2();
        s1.home();
        s1.flat();
        s1.gf_farm();

        System.out.println("--------------------------------------");
        //father can access grandfather A and B
        System.out.println("Father can access the Gran father A and B ");
        f1.Father = 152;
        System.out.println(f1.Father);
        f1.gf_farm();
        f1.flat();
        f1.home();

        System.out.println("------------------------------------------");
        System.out.println("Grandfather can only access only his A nad B ");
        System.out.println(gf1.gf);
        gf1.gf_farm();
        gf1.home();

    }
}
