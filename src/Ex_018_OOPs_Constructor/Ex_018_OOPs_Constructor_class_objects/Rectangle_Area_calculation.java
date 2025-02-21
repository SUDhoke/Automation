package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class Rectangle_Area_calculation
{
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(5.2f,5.6f);
        R1.calculateArea();
    }

}
class Rectangle
{
    //attributes(fields/properties)
    float length;
    float width;

    //Constructor to initialize values
    Rectangle(float len, float wid)
    {
        this.length = len ;
        this.width = wid;
    }

    //method for calculate area
    public void calculateArea()
    {
        float Area = length * width;
        System.out.println("Area : "+Area);
    }
}
