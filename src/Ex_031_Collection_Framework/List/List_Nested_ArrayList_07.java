package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class List_Nested_ArrayList_07
{
    public static void main(String[] args) {
        List<String> Fruits1 = new ArrayList<>();
        Fruits1.add("orange");
        Fruits1.add("apple");
        Fruits1.add("cherry");
       // Fruits1.add(123); //String Restriction
        System.out.println(Fruits1);

        List Fruits2 = new ArrayList();
        Fruits2.add("mango");
        Fruits2.add("grapes");
        Fruits2.add("papaya");
        System.out.println(Fruits2);

        List Vegetables = new ArrayList();
        Vegetables.add("Tomato");
        Vegetables.add("paotato");
        Vegetables.add("onion");
        System.out.println(Vegetables);

        List all = new ArrayList();
        all.add(Fruits1);
        all.add(Fruits2);
        all.add(Vegetables);
        System.out.println(all);

        List<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println(num1);

        List<Integer> num2 = new ArrayList<>();
        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);
        System.out.println(num2);

        List all_num = new ArrayList<>();
        all_num.add(num1);
        all_num.add(num2);
        System.out.println(all_num);
        System.out.println(all_num.get(1));
    }
}
