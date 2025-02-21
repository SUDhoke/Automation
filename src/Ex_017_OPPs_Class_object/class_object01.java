package Ex_017_OPPs_Class_object;

public class class_object01
{

    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name);
    }
}
class student
{
    String name =  "sonali";
    int age ;
    int roll_no;
}
