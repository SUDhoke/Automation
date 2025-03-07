package Ex_025_Static_keyword;

public class static_04
{
    public static void main(String[] args) {
        //calling
        student st = new student("sonali",35);
        st.display();

       int result = student.total_student_class(100);
        System.out.println("total student in first class :"+result);

    }
}
class student
{
    //Attribute
    String name;
    int roll_no;
    static String class_name = "1st_class";
    //shared amongst all the instances it is a non - assess modifier
    //can be accessible without creating an object

    student(String name,int roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }
     void display()
    {
        System.out.println("Student Details :");
        System.out.println("student name :"+this.name);
        System.out.println("Student roll number : "+this.roll_no);
        System.out.println("class :"+class_name);

    }
    static int total_student_class(int total)
    {
       return total;
    }
}
