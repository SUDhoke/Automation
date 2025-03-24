package Ex_031_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_Collection_04
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id1",01);
        map.put("id2",02);
        map.put("id3",03);


        //iterate over map
        for(Map.Entry<String,Integer> test : map.entrySet())
        {
            System.out.println(test.getKey()+"-->"+test.getValue());
        }
        System.out.println("--------------------------------------");

        for(Map.Entry<String,Integer> item : map.entrySet())
        {
            System.out.println(item.getKey()+"-->"+item.getValue());
        }
    }
}
