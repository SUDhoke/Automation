
package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Collection_14
{
    public static void main(String[] args) {
        student s1 = new student("Sonal" ,"1");
        student s2 = new student("monal", "2");

        List<student> list_of_student = new ArrayList<>();
        list_of_student.add(s1);
        list_of_student.add(s2);

        System.out.println(list_of_student);
        s1.print();
        s2.print();
        s1.toString();
        s2.toString();

    }
}
