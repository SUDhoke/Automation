package Ex_029_Aggregation;

public class Aggregation_01
{
    public static void main(String[] args) {
        Professor prof = new Professor("john");
        Department dept = new Department("IT",prof);
        dept.display();
    }
}
class Professor
{
     static String name;

    Professor(String name)
    {
        this.name = name;
    }
public void display()
{
    System.out.println("Professor name :"+name);
}
}
class Department
{
    String department_name;
    Professor professor;

    public Department(String department_name, Professor professor) {
        this.department_name = department_name;
        this.professor = professor;
    }

//    public void display() {
//        System.out.println("Professor: " + professor.name + "\nDepartment: " + department_name);
//    }

    public void display()
    {
        System.out.println(department_name+"\n"+Professor.name);
    }
}