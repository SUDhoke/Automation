package Ex_020_Polymorphism.Method_oveloading.Method_overloading_practice;

public class print
{
    public static void main(String[] args) {
        printer p1 = new printer();
        p1.print(50);
        p1.print(50.56D);

        String s1 = p1.print("Sonali_Dhoke");
        System.out.println("String value :"+s1);
    }
}
class printer
{
    void print(int a)
    {
        System.out.println("Integer value:"+a);
    }
    void print(double b)
    {
        System.out.println("Double value : "+b);
    }
    public String print(String s)
    {
        return s;
    }
}