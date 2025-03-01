package Ex_020_Polymorphism.Method_oveloading.Method_overloading_practice;

public class Area
{
    public static void main(String[] args) {
       shape sh1 = new shape();
       int result = sh1.area(5);
        System.out.println(result);

        int result2 = sh1.area(5,6);
        System.out.println(result2);
    }
}
class shape
{

    int area(int side)
    {
        return side*side;
    }
    double area(double radius)
    {
        final float PI = 3.14F;
        return PI * (radius * radius);

    }
    int area(int length,int width) {
        return length * width;
    }


}
