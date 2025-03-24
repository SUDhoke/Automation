package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Iteration_12
{
    public static void main(String[] args) {


        List L = new ArrayList();

        L.add("sonali");
        L.add("Moanli");
        L.add("Khushali");
        System.out.println(L);

        //Iteration
        System.out.println("For Loop-----------------");
        for (int i = 0; i < L.size(); i++) {
            System.out.println(L.get(i));
        }
        System.out.println("for each Loop --------");
        for (Object object : L) {
            System.out.println(object);
        }
    System.out.println("Iterator----------------");
        Iterator I = L.iterator();
        while(I.hasNext())
        {
            System.out.println(I.next());
        }

    }
}
