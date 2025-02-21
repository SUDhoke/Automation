package Ex_016_Array;

public class Array_sum_of_array
{
    public static void main(String[] args) {

        int[] array = {12,34,56};

        int sum = 0;

//        for(int i = 0; i<array.length; i++)
//        {
//            sum = sum + array[i];
//        }
//        System.out.println("sum :"+sum);

        //using for each loop

        for(int result : array)
        {
            sum = sum + result;
        }
        System.out.println(sum);
 }
}
