package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_collection_02
{
    public static void main(String[] args) {
        //list is an interface - and for interface we can not create object
        //so we can use .of for list
        //static methods are fully implemented in interface
        //Default method - can fully implement in interface
        List list_Fruits = List.of("orange", "mango","cherry","watermelon","apple","banana");
        System.out.println(list_Fruits);
       // list_Fruits.add("banana1"); // UnsupportedOperationException
       // list_Fruits.remove("apple"); // it is an interface so can not perform add and remove method

        ArrayList al = new ArrayList();
        al.add("Sonali");
        al.add("Anjali"); // adds the specified elements to the end of the list
        System.out.println(al);

        ArrayList<String> names = new ArrayList<>();
        names.add("Anjali"); // adds the elements
        names.add("Babita");
        names.add("Chameli");
        names.add("sonali");
        names.add("sonali");
        names.add(0,"Alka"); // adds the elements at specified index
        names.remove("Alka"); //  remove elements
        names.remove(1); // removes elements at specified index

        System.out.println(names);
        System.out.println(names.get(0)); // retrieve an element
        names.set(1,"zudic"); //updating elements at a specified index
        System.out.println(names);
        System.out.println(names.size()); // to get the size of the Arraylist
        System.out.println(names.contains("sonali"));
        System.out.println(names.isEmpty()); // checks if the arraylist is empty
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
    }
}
interface a
{
    public static void m()
    {
        System.out.println("static");
    }
    public default void test()
    {
        System.out.println("default");
    }

    void m1();

}