package Ex_025_Static_keyword;

public class static_03
{
    public static void main(String[] args) {

        ATB10 A = new ATB10();
        System.out.println("....Get details....");
        System.out.println("....Set Details....");
        System.out.println(A.getName());
        System.out.println(A.getPh());
    }
}
class ATB10
{
    //IIB
    {
        System.out.println("This block get called when object is created");
    }
    //static initialization Block - SIB
    static {
        System.out.println("Load the class - i will execute");
    }
    //attributes - encapsulation
    private String name;
    private String ph;
    static String course = "Automation";

    //getter and setter method for private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
    //static method
    static void assign()
    {
        System.out.println("Assign method");
    }
}