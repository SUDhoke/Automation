package Ex_031_Collection_Framework.SET;

import java.util.HashSet;
import java.util.Iterator;

public class SET_collection_03
{
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<>();

        hashset.add("Orange");
        hashset.add("Mango");
        hashset.add("cherry");
        System.out.println(hashset);

        //iteration
//        for (int i = 0; i < hashset.size() ; i++) {
//             System.out.println(hashset.);
//} //can not use normal for loop

        hashset.remove("Orange");
        System.out.println(hashset);

        //for each loop
        System.out.println("For Each Loop-------------");
        for(Object obj :  hashset)
        {
            System.out.println(obj);
        }

        System.out.println("Iterator--------------------");
        Iterator I = hashset.iterator();
        while(I.hasNext())
        {
            System.out.println(I.next());
        }
    }

}
