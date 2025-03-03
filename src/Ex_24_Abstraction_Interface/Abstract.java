package Ex_24_Abstraction_Interface;

public class Abstract
{
    public static void main(String[] args) {

        child c = new child();
        c.loan50k();
        c.laon25k();

        System.out.println("........................");
        //with parent class reference we cam create child class object
        father f1 = new child();
        f1.laon25k();

        //father f2 = new father();// abstract class can not have objects
    }
}
//abstraction - hides the complex implementation and show the essential features
//abstract class
abstract class father
{
    //abstract method
    abstract void loan50k();//incomplete method
    void laon25k()
    {
        System.out.println("Given by father - 25k");
    }


}
class child extends father
{
    @Override
    void loan50k() {
        System.out.println("Given by child");
    }
}
