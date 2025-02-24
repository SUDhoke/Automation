package Ex_020_Polymorphism.Method_overriding;

public class Method_overriding_02
{
    public static void main(String[] args) {
        TC1 t1 = new TC1();
        t1.openB();

        TC2 t2 = new TC2();
        t2.openB();
    }
}
class commontoall
{
    void openB()
    {
        System.out.println("Open the browser in 5 sec ");
    }
}

class TC1 extends commontoall
{
    void startTC()
    {
        openB();
    }

}
class TC2 extends commontoall
{
    @Override
    void openB() {
        System.out.println("Open the Browser in 2 sec ");
    }
}
