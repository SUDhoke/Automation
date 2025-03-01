package Ex_24_Abstraction_Interface;

public class Revise_con_super_poly_inher_all_concepts
{
    public static void main(String[] args) {

        alto al = new alto(100);
        al.display();

    }
}
class car
{
    //attributes

    Integer max_speed;
    //method
    void no_test()
    {
        //blank method have nothing inside it
    }
    //Default constructor
    car()
    {
        System.out.println("Default Constructor");
    }
    //parameterised constructor
    car(Integer maxspeed)
    {
        this.max_speed = maxspeed;
    }
    //poly - method overloading
    void message(String msg)
    {
        System.out.println("method overloading - A method with string type of parameter : "+msg);
    }
    //another method with same name and different paramters
    void message(String name, String msg)
    {
        System.out.println("method overriding - A method with two parameters : "+name + "\n"+ msg);
    }
    void display()
    {
        System.out.println("car display");
    }
}

class alto extends car{

    //Attribute
    private Integer maxspeed; // encapsulation

    //constructor - default constructor
    alto()
    {
        super();
    }
    //parametrised constructor
    alto(Integer maxspeed)
    {
        super(180);
        this.maxspeed = maxspeed;// this is alto param constructor
    }

    //method overriding


    @Override
    void display() {
        super.display();
        System.out.println("override display method of car class");
        System.out.println(super.max_speed); // parent class attribute using super keyword
        System.out.println(this.maxspeed);//current object/variable of a class
        super.message("hello");
        super.no_test();
        super.message("sonali","hii");

    }
}
