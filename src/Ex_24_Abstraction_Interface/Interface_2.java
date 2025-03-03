package Ex_24_Abstraction_Interface;

public class Interface_2
{
    public static void main(String[] args) {
        interface_I1_I2 result = new interface_I1_I2();

        result.test();
        result.no_test();
        result.exploratory_test();
        result.functional();
    }
}

class interface_I1_I2 implements I1,I2
{
    void functional()
    {
        System.out.println("Method/Function");
    }
    @Override
    public void test()
    {
        System.out.println("implementation of incomplete method - in the interface");
    }
    @Override
    public void no_test()
    {
        System.out.println("No -test - implementation of incomplete method - interface");
    }
    @Override
    public void exploratory_test() {
        System.out.println("I2 - interface - implementation of incomplete method");
    }
}
interface I1
{
    void test();
    void no_test();

}
interface I2
{
    void exploratory_test();
}