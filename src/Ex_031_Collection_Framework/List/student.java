package Ex_031_Collection_Framework.List;

public class student
{
    private String name;
    private String rollNo;

    public student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void print()
    {
        System.out.println(name);
        System.out.println(rollNo);

    }
    @Override
    public String toString()
    {
        return "Student {"+"name = "+name+"rollNo = "+rollNo+'}';
    }
}
