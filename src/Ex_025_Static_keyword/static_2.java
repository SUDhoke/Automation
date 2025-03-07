package Ex_025_Static_keyword;

public class static_2
{
    public static void main(String[] args)
    {
        ATB sona = new ATB(230125,"sona");
        sona.display();
        sona.attendance();
        System.out.println("..........calling course name via class name ..................");
        System.out.println(ATB.course);
        System.out.println("...........calling static method...............................");
        sona.present_student_number((byte) 60);//can be call using object
        System.out.println("................................................................");
        ATB.present_student_number((byte) 60);
    }
}
//class
class ATB
{
    //static variable
    static String course = "ATB";
    //instance variables
    Integer ph;
    String name;
    //Byte total;

    //constructor
    ATB(Integer ph,String name)
    {
        this.ph = ph;
        this.name = name;
    }
   void display()
    {
        System.out.println("Details of a student: "+course+name+this.ph);
    }
    void attendance()
    {
        System.out.println("mark attendance");
    }
    static void present_student_number(Byte total)
    {
        System.out.println("Total student present: "+total);
    }
}