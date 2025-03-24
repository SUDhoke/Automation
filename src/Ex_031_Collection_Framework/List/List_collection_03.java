package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_collection_03
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(); //applying restriction to enter only integer
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(7);

        System.out.println("-------------------------------");
        System.out.println(l.size());
        l.add(9);
        System.out.println(l);
        l.add(1,10);
        System.out.println(l);
        l.remove(1);//removes value at specified index
        System.out.println(l);
        System.out.println(l.get(3)); //retrieve element at specified index
        l.set(1,25);
        System.out.println(l); //update the value at the specified index
        System.out.println(l.isEmpty());
        System.out.println(l.contains(1));
        System.out.println(l.indexOf(1));
        System.out.println(l.lastIndexOf(1));
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);


        //how to iterate using for loop
        for(int i = 0; i<l.size();i++)
        {
            System.out.println(l.get(i)); //get is to retrieve data
        }


    }
}
