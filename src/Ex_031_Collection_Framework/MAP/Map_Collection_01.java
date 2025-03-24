package Ex_031_Collection_Framework.MAP;

import java.util.*;

public class Map_Collection_01
{
    public static void main(String[] args) {
        //Map - interface
        //classes -> HashMap,LinkedHashMap,TreeMap,HashTable
        Map m1 = new HashMap(); //hashmap is unordered
        m1.put("name","sonali");
        m1.put(1,123);
        m1.put(1,123); //duplicates are removed
        m1.put(1,456); //for duplicate keys the Recent value is updated
        m1.put(2,123);
        m1.put(3,123); //if value is duplicated and key is unique it enters the value
        m1.put(null,123); // only one null key and multiple null values
        System.out.println(m1);

        Map m2 = new LinkedHashMap(); //Insertion order is maintained

        m2.put(1,1);
        m2.put("name","Sonali");
        m2.put("Id","123654");
        m2.put(1,2); // key is duplicate then latest value is assigned
//        m2.put(null); // no null
        System.out.println(m2);
        System.out.println(m2.get("name"));
        m2.remove(1);
        System.out.println(m2);


        //TreeMap
        Map m3 = new TreeMap();
        m3.put(1,"sonali");
        m3.put(3,"ritwik");
        m3.put(2,"prarthana");
        m3.put(2,"shobhana");
//        m3.put(null,"master"); no null is supported in Treemap
        System.out.println(m3);//sorted order natural order
        System.out.println(m3.get(1));
        System.out.println(m3.size());
        System.out.println(m3.isEmpty());
        m3.remove(1);
        System.out.println(m3);





    }

}
