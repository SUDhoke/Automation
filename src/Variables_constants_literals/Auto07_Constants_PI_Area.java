package Variables_constants_literals;
import java.util.*;

public class Auto07_Constants_PI_Area
{
    public static void main(String[] args)
    {
        final float PI= 3.14f;
        int radius;
        float area;

        System.out.println("Enter value for Radius");
        Scanner sn = new Scanner(System.in);
        radius=sn.nextInt();

        area = PI*(radius*radius);
        System.out.println("Area ="+area);


    }
}
