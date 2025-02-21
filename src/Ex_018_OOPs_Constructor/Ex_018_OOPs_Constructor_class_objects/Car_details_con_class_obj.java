package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

public class Car_details_con_class_obj
{
    public static void main(String[] args) {

        car c1 = new car("new_car_alto","alto_test",123.22F);
        c1.car_display();

        car c2 = new car("new_car_wagnar","wagnar_test",258.369F);
        c2.car_display();
    }

}
class car
{
    String Brand;
    String Model;
    float price;

    //parameterised constructor

    car(String Brand_c, String Model_c, float price_c)
    {
        System.out.println("parameterised constructor : ");
        this.Brand = Brand_c;
        this.Model = Model_c;
        this.price = price_c;

    }

    //method to display details

    void car_display()
    {
        System.out.println("Display - Car details ");
        System.out.println("Car_Brand :"+Brand + "\n"+"Car_model : "+Model+"\n"+"Car_price : " +price);
    }
}
