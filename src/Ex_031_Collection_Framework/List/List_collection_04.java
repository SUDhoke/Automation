package Ex_031_Collection_Framework.List;
import java.util.*;

public class List_collection_04
{
    public static void main(String[] args) {

        List myList = new ArrayList(50); // can assign initial capacity
        List myList1 = new ArrayList();
        myList1.add(123);
        myList1.add(null);
        myList1.add(null);
        myList1.add(null);
        myList1.add(null);
        System.out.println( myList1);

        List myList2 = new LinkedList();
        myList2.add("Test");
        myList2.add(123);
        myList2.add(true);
        myList2.add(1.2f);
        myList2.add(null);
        myList2.add(null);
        myList2.add(null); //in linked list can add multiple null
        System.out.println(myList2);
        myList2.remove("Test");
        System.out.println(myList2);
        System.out.println(myList2.get(5));
        myList2.set(5,"Sonali"); //update
        System.out.println(myList2);

        System.out.println(myList2.size());
        System.out.println(myList2.isEmpty());
        System.out.println(myList2.contains(null));
    }

    public static class List_ArrayList_UserInpur_09
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
}
