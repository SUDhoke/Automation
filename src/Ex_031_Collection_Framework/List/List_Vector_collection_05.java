package Ex_031_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class List_Vector_collection_05
{
    public static void main(String[] args) {
        Vector v = new Vector(); //array //leagcy class
        v.add(123);
        v.remove(0);
        v.add(456);
        v.add(745);
        v.add(null);
        v.add(null);
        v.add(null);
        System.out.println(v);
        System.out.println("----------------");

        //how to iterate over vector
        Iterator i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //iterate using enumeration
        System.out.println("Enumeration----------");
        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println("For Each --------------");
        for(Object obj : v)
        {
            System.out.println(obj);
        }
    }
}
