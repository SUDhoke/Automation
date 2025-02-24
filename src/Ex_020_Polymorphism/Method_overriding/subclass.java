package Ex_020_Polymorphism.Method_overriding;

import Ex_019_OOPs_Inheritance.Hierarchical_inheritance.Father;

public class subclass extends Father_OR
{
    @Override
    void home() {
        System.out.println("override with subclass home");
    }
    void sub()
    {
        System.out.println("Additional Method ");
    }
}

class main_method_Overriding
{
    public static void main(String[] args) {
        //subclass method and calling with subclass object
        System.out.println("Child Class _ method overriding ");
        subclass s1  = new subclass();
        s1.home();
        s1.sub();
        System.out.println("End ...............................");

        //parent /superclass and calling with superclass objects
        System.out.println("Parent class _method overriding");
        Father_OR f1  = new Father_OR();
        f1.home();
        System.out.println("End ..................................");

        //Dynamic Dispatch - very important concept
        System.out.println("Dynamic Dispatch ");
        Father_OR f2 = new subclass(); // this is dynamic dispatch
        //with parent class reference we can create the child class object and use it
        f2.home();//method overriding - ridden the parent class method
        System.out.println("End ....................................");

      //  subclass s2 = new Father_OR(); // vice versa is not possible wit chile class ref can not create the parent class object



    }
}
