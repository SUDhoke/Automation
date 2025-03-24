package Ex_031_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_collection_02
{
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Apple"); //unordered ordered is not maintained
        set.add("Orange");
        set.add(1);
        set.add(9);
        set.add(9); //duplicate values are removed and stored only one value
        set.add(null);
        set.add(null);
        set.add(null);
//        set.remove(null);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(null));
        System.out.println(set);


        Set set1 = new LinkedHashSet(); //maintain insertion order
        set1.add(123);
        set1.add("Sonali");
        set1.add(3.5f);
        System.out.println(set1);

        Set set2 = new TreeSet();
        set2.add(236); //natural sorting
        set2.add(123);
//        set2.add("sona"); //only same type of data can add
        set2.add(456);
        System.out.println(set2);

        Set all_Set = new HashSet();

        all_Set.add(set1);
        all_Set.add(set);
        all_Set.add(set2);
        System.out.println(all_Set);



    }
}
