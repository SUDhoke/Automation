package Ex_017_OPPs_Class_object;

public class Class_person_object
{
    public static void main(String[] args) {

        class_person pr = new class_person();
        pr.name = "Sonali";
        pr.age = 25;
        pr.salary = 560;

        System.out.println("name :"+pr.name+"\n"+"age :"+pr.age+"\n"+"salary : "+pr.salary);
    }
}
