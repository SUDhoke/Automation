package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArrayList_08
{
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(96);
        System.out.println(marks);

        //sorting
        Collections.sort(marks); //Collections class, Collection is interface
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
