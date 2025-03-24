package Ex_031_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_Collection_03
{
    public static void main(String[] args) {
        Map<String,Object> Map1 = new HashMap<>();
        Map1.put("name","Sonali");
        Map1.put("phone number",152639874);
        Map1.put("address","Nagpur");
        Map1.put("pincode",12345);

        //this is set which is unordered and no duplicates
        Set Map1_items = new HashSet();
        Map1_items.add("test1");
        Map1_items.add("test2");
    }
}
