package Ex_019_OOPs_Inheritance.Hierarchical_inheritance;

public class main_hierarchical
{
    public static void main(String[] args) {
        //create object of a class subclass1
        System.out.println("Sonali Subclass ");
        Sonali s1 = new Sonali();
        System.out.println(s1.ft);
        s1.home();//if subclass and superclass has the same method then it will access the subclass method only

        System.out.println("---------------------------------");
        System.out.println("Anjali Subclass");
        // create object of a subclass 2 and access elements from father/superclass
        Anjali a1 = new Anjali();
        System.out.println(a1.ft);
        a1.home();
        a1.h();

        System.out.println("--------------------------------------");
        System.out.println("Third subclass");
        D d1 = new D();
        System.out.println(d1.ft);
        d1.Di();
        d1.home();

    }
}
