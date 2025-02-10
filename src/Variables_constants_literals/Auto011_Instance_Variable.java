package Variables_constants_literals;

public class Auto011_Instance_Variable
{

    String Emp;

    //method to set name

    public void EMP(String name)
    {
        Emp = name;

    }

    // another method to display name using instance variable

    public void display()
    {
        System.out.println("Emp name :" +Emp);
    }


    public static void main(String[] args)
    {
        Auto011_Instance_Variable EM = new Auto011_Instance_Variable();

        EM.EMP("Sonali_Dhoke");
        EM.display();



    }
}
