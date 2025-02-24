package Ex_020_Polymorphism.Method_oveloading;

public class Main_method_overloading
{
    public static void main(String[] args) {

        Math_operations m1 = new Math_operations();

       int r1 =  m1.add(5,6);
        System.out.println(r1);

       int r2 =  m1.add(40,25,26);
        System.out.println(r2);

        float f1 = m1.add(1.2f,1.5f,1.6f);
        System.out.println(f1);
    }
}
