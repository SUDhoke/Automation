package Ex_017_OPPs_Class_object;

public class class_object_with_method
{
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name = " cat 01";

        c1.sleep();

     c1.age_cat(25);
//        System.out.println(age1);
    }

}
class Cat
{
    String name;
    String breed;

    void sleep()
    {
        System.out.println("lazy cat sleeping only");
    }

    static int age_cat(int age)
    {
        System.out.println("cat age :"+age);
        return age;
    }


}
