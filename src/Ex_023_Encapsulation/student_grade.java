package Ex_023_Encapsulation;

public class student_grade
{
    public static void main(String[] args) {
       teacher t = new teacher("madam");
       t.display();

    }
}
// class creation
class student
{
    //attributes
   private int student_id;
   private String student_name;
   private int student_marks;

   //parametrised creation
    student(int id , String n, int mr)
    {
        this.student_id = id;
        this.student_name = n;
        this.student_marks = mr;
    }
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_marks()
    {
        return student_marks;
    }

    public void setStudent_marks(int student_marks)
    {
        this.student_marks = student_marks;
        if(student_marks >100 && student_marks <=0)
        {
            System.out.println("this is not valid input");
        }
        else {
            System.out.println("Enter mark0s : " +this.student_marks);
        }

    }

    char get_Grade()
    {

        if(this.student_marks >=90)
        {
            return 'A';
        } else if (this.student_marks>=75)
        {
        return 'B';
        } else if (this.student_marks >=60)
        {
            return 'c';
        }else
        {
            return 'F';
        }

        }
    }
    class teacher extends student
    {
        String teacher_name;

        //constructor
        teacher(String name )
        {
            super(2,"newbei",55);
            this.teacher_name = name;

        }

        void display()
        {
            System.out.println("Teacher and student details are as below :");
            System.out.println("Class Teacher name : "+this.teacher_name);
            System.out.println("Student ID :."+super.getStudent_id());
            System.out.println("Student name :"+super.getStudent_name());
            System.out.println("Student Marks : "+super.getStudent_marks());
            System.out.println("Student Grade :"+super.get_Grade());

        }
    }