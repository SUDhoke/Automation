package Ex_031_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List_ArrayList_UserInpur_09
{
    public static void main(String[] args) {

        //multiple inputs for user and store them in separate
        //ArrayList_Collection_14 based on user-defined categories
        //Names,ages - store them

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continue_input = "Y"; //Control variables for input loop

        while(continue_input.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Name");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to continue (Y/N)");
            continue_input = sc.nextLine();
        }
        System.out.println("Iterator-------------------------");
        //Using Iterator - 1

        Iterator iterator = names.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        Iterator iterator1 = ages.iterator();
        while(iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        // for each loop
        System.out.println("For Each Loop---------------------");
        for(Object obj : names)
        {
            System.out.println(obj);
        }
        for(Object obj1 : ages)
        {
            System.out.println(obj1);
        }
    }
}
