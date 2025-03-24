package Ex_031_Collection_Framework.List;

import java.util.Stack;

public class Stack_collection_13
{
    public static void main(String[] args) {

        Stack s = new Stack();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(null);
        s.add("Sonali");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.get(0));
        System.out.println(s.peek()); //view top element in the stack last in first out
        System.out.println(s.pop()); // removes the top element of the top
        System.out.println(s);
    }
}
