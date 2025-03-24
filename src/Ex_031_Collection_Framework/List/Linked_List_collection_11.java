package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List_collection_11
{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("1");
        l.add("2");
        l.add("2");
        l.add("2");
        l.add("2");
        System.out.println(l);

        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        System.out.println(l1);

        //ArrayList_Collection_14
        ArrayList AL = new ArrayList();
        AL.add(1);
        AL.add(2);
        AL.add(3);
        AL.remove(1);
        System.out.println(AL);
    }
}
