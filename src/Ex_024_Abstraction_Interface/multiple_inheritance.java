package Ex_024_Abstraction_Interface;

public class multiple_inheritance
{
    public static void main(String[] args) {
        C_child result = new C_child();
        result.money();
        result.Home_mother();
        result.farmhouse();
    }
}

//multiple inheritance using interfaces

class C_child implements Father,Mother
{
    @Override
   public void money()
    {
        System.out.println("same name method will only gets used one time");
    }

    @Override
    public void Home_mother() {
        Mother.super.Home_mother();
    }
}
interface Father
{
    void money();
    //interface can have incomplete method and by using default keyword can have complete function
    default void farmhouse()
    {
        System.out.println("Father farmhouse");
    }

}
interface Mother
{
    void money();
    default void Home_mother()
    {
        System.out.println("Mothers Home");
    }

}