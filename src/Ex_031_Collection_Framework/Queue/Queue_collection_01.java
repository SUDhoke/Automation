package Ex_031_Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue_collection_01
{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(123);
//        pq.add("sonali"); //same type of elements can be added
        pq.add(569);
        pq.add(569); //duplicates are allowed
//        pq.add(null); // no null values are supported
//        pq.add(null);
        System.out.println(pq);

        ArrayDeque  ad = new ArrayDeque();
        ad.add(1);
        ad.add(2);
        System.out.println(ad);


    }
}
