package Ex_031_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_collection01
{
    public static void main(String[] args) {

        //SET - interface has classes  in set no duplicates are allowed unordered
        //classes - Hashset, TreeSet,LinkedHashSet
        Set set1 = new HashSet(); //no duplicates,no order maintained ,allow null , no sorting,uses hash table
        Set set2 = new LinkedHashSet(); //no duplicates, insertion order maintained , allow null, no sorting,uses hashtable + doubly linked list
        Set set3 = new TreeSet(); //no duplicates, no null,sorted in natural order, uses red - black tree

        set1.add(1);
        set1.add("sona");
        set2.add(2);
        set2.add("sona");
        set3.add(3);
//        set3.add("sona"); treeset can have same datatype elements as it contains natural sorting
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);


    }
}
