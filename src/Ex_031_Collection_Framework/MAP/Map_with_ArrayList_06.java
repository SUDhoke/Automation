package Ex_031_Collection_Framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;

public class Map_with_ArrayList_06
{
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();

       HashMap<String,String> student2 = new HashMap<>();

        student1.put("name","Sonali");
        student1.put("Roll_no","1122");
        student1.put("city","NGP");

        student2.put("name","krishana");
        student2.put("Roll_no","1");
        student2.put("city","NGP");

        ArrayList<Object> list_of_student = new ArrayList<>();
        list_of_student.add(student1);
        list_of_student.add(student2);
        System.out.println(list_of_student);




    }
}
