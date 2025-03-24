package Ex_031_Collection_Framework.MAP;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Map_HashTable_05
{
    public static void main(String[] args) {
        Map<Integer, String> test = new Hashtable<>(); //hashtable is a legacy class,synchronized, threadsafe
        test.put(1,"Sonal");
        test.put(2,"Monal");
        test.put(3,"Shree");
        test.put(4,"Krishna");
        System.out.println(test);

        //we can use Enumeration for iteration
        Enumeration<Integer> e = ((Hashtable<Integer, String>) test).keys();
        {
            while(e.hasMoreElements())
            {
                System.out.println(e.nextElement());
            }
        }
        for(Map.Entry<Integer,String>  view_data : test.entrySet())
        {
            System.out.println(view_data.getKey()+"--->"+view_data.getValue());
        }
    }
}
