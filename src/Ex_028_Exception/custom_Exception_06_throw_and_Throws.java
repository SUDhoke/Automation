package Ex_028_Exception;

public class custom_Exception_06_throw_and_Throws
{
    public static void main(String[] args) {
        Student st = new Student("sonal",100);
        try {
            st.SetGrade(101);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
class Student
{
    String name;
    int grade;

    Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }
    public void SetGrade(int Grade) throws InvalidGradeException
    {
        if(Grade > 100 || Grade < 0)
        {
            InvalidGradeException IGE = new InvalidGradeException("Not a valid grade");
            throw IGE;

        }else
        {
            System.out.println(Grade);
        }

    }
}
class InvalidGradeException extends Exception{
    InvalidGradeException(String Exception_message)
    {
        super(Exception_message);
    }
}