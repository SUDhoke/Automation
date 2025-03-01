package Ex_020_Polymorphism.Method_overriding.Method_overriding_practice;

public class AnimalSound
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makesound();

        Animal a1 = new Dog();
        a1.makesound();

        Animal a2 = new cat();
        a2.makesound();
    }
}
//superclass
class Animal{

    void makesound()
    {
        System.out.println("Animal Sound superclass method");
    }
}
//subclass
class Dog extends Animal{
    @Override
    void makesound() {
        System.out.println("Bark");
    }
}
class cat extends Animal {
    @Override
    void makesound() {
        System.out.println("Meow");
    }
}
