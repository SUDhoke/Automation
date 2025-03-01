package Ex_019_OOPs_Inheritance.practice_inheritance;

import javax.xml.namespace.QName;

public class Multilevel_ih
{
    public static void main(String[] args) {
        Dog dg = new Dog("Dog_name","Dog_type",true,"Dog_breed");
        System.out.println("Details : \n"+dg.name+"\n"+dg.type+"\n"+dg.warm_bl+"\n"+dg.breed);
        dg.bark();
    }
}
//base class / superclass
class Animal
{
    //Attributes
    String name;
    String type;

    //Constructor
    Animal(String n, String t)
    {
        this.name = n;
        this.type = t;
    }
    void eat()
    {
        System.out.println("Eat Function - animal");
    }
    void sleep()
    {
        System.out.println("Sleep function - animal");
    }
}
class mammal extends Animal
{
    //attributed
    boolean warm_bl;

    //constructed
    mammal(String n,String t,boolean w)
    {
        super(n,t);
        this.warm_bl = w;
    }
    void giveBirth()
    {
        super.eat();
        super.sleep();
        System.out.println("mammal class - function");
    }
}
class Dog extends mammal
{
    //Attributes
    String breed;

    //constructor
    Dog(String n,String t,boolean w,String b)
    {
        super(n, t, w);
        this.breed = b;
    }
    void bark()
    {
        super.giveBirth();
        System.out.println("Dog class - functions");
        System.out.println("Details : \n"+name+"\n"+type+"\n"+warm_bl+"\n"+breed);
    }

}