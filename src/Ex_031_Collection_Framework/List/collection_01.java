package Ex_031_Collection_Framework.List;

public class collection_01
{
    public static void main(String[] args) {


        //List -> interface

        //classes -> ArrayList , LinkedList, Vector(Legacy class), Stack
        //array problem
        //has fixed size
        //only can have the similar type of data
        //Does not grow automatically
        //fewer elements -> wastage of memory  -> 100 size only used 10 90 are wasted

        Integer[] array = new Integer[10]; // fixed size
        Integer[] numbers = {1, 2, 3, 4}; // similar type of data
        System.out.println(numbers[0]);

    }
}
