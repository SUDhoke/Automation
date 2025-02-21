package Ex_018_OOPs_Constructor;

public class Con_03
{
    public static void main(String[] args) {

        test t1 = new test();
    }

}
class test
{
    String name;

    //Default constructor
    test()
    {
        System.out.println("Default Constructor - with same name as class name - special method used to initialize attributes when object is created");
    }

    //Instance initialization block
    {
        System.out.println("I am called first as step 1 and named as IIB");
    }
}
