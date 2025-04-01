package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_collection15
{
    public static void main(String[] args) {
        List list_of_fruits = new ArrayList();
        list_of_fruits.add("Mango");
        list_of_fruits.add("Papaya");
        list_of_fruits.add("Watermelon");
        list_of_fruits.add("grapes");
        list_of_fruits.remove("Mango");

        System.out.println(list_of_fruits);

        System.out.println(list_of_fruits.get(0));

        System.out.println(list_of_fruits.size());
        System.out.println(list_of_fruits.isEmpty());
        System.out.println(list_of_fruits.contains("Mango"));

    }
}
