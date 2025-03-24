package Ex_025_Static_keyword;

public class Static_01
{
    public static void main(String[] args) {

        student10 s1 = new student10(25);
        s1.test(); //calling by creating object
        System.out.println("...............................");
        System.out.println(s1.age);
        student10.test();//here calling test method by using class name
        System.out.println("................................");

        student10 s2 = new student10(35);
        System.out.println(s2.age);
        System.out.println(".................................");
        System.out.println(student10.course_name);

    }
}
//1.static is a keyword
//2.it's a non-access modifier which indicates to method and variable
//3.static method can be  shared amongst all the instances /it is common to all
//4.we can access the static method and variable without creating an object
//5.static can be variable, method,static block, static class (not useful)
//6.we can call the static variables and method using class name ex student10.test();
//7.static variables and methods are common to all.

class student10
{
    Integer age;
    static String course_name = "ATB"; //class Loader level
    String name = "mona";
   public student10(Integer age_c)
    {
        this.age = age_c;
    }


    //static method
    static void test()
    {
        System.out.println("This is the static method");
    }

}