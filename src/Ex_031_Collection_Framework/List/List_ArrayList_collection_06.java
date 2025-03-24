package Ex_031_Collection_Framework.List;

import java.util.*;

public class List_ArrayList_collection_06 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sonali");
        list.add("Monali");
        list.add("pranali");
        list.add("gitali");
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(null));
        System.out.println(list.indexOf(null));
        System.out.println(list.lastIndexOf(null));
        list.remove(1);
        list.remove("gitali");
        list.set(0, "Anjali");
        System.out.println(list.get(2));
        System.out.println(list);

        System.out.println("----------------------");
        System.out.println("for loop-----------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("for each loop-------");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("Iterator-------------");
        Iterator ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println("Enumeration------------");
        Enumeration e = Collections.enumeration(list);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}