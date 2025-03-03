package Ex_24_Abstraction_Interface;

public class interface_3
{
    public static void main(String[] args) {

        test t = new func();
        t.display();
        System.out.println("........................");
        func f = new func();
        f.display();
        System.out.println(".........................");
        t.meth();
    }
}

class func implements test
{
    @Override
    public void meth()
    {
        test.super.meth();
    }

    @Override
    public void display()
    {
        System.out.println(a);
    }
}
//interface
interface test
{
    public int a = 110;
    void display();

    default void meth()
    {
        System.out.println("Method");
    }
}
