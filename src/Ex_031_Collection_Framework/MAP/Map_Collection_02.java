package Ex_031_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_Collection_02
{
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id1",1);
        map.put("id1",2);
        map.put("id2",2);
        map.put("id3",3);
        map.put("id4",4);
        map.put("id5",null);
        map.put("id6",null);
        map.put(null,6); //duplicate keys are removed and stored at once only and lasted value is assigned
        map.put(null,7); //supports null -> one null key and multiple null values
        System.out.println(map);
        System.out.println("------------------------------------");
        System.out.println(map.get("id1")); // returns vale assigned to key
        System.out.println(map.remove(null)); //removes key value pair for particular key
        System.out.println(map);
        System.out.println(map.containsKey(null));
        System.out.println(map.containsValue(null));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
//        map.clear();
//        System.out.println(map);
        System.out.println(map.keySet()); //returns all the keys that are set
        System.out.println(map.entrySet()); //returns all the keys and value
        System.out.println(map.values()); //returns all the values


    }
}
