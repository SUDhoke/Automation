package Ex_016_Array;

import java.util.Arrays;

public class Array_fibonacci {
    public static void main(String[] args) {
         int[] array = {5,2,3};

        System.out.println("Length of an array : " +array.length);
//        Arrays.sort(array);//array function for sorting
//        System.out.println("print array elements :" +Arrays.toString(array));//print array
         int first_no = array[0];
        System.out.println("First element of an array : "+first_no);
         int second_no = array[1];
        System.out.println("Second element of an array :"+second_no);



        for(Object print : array)
        {
            print = first_no + second_no;
            first_no = second_no;
            second_no = (int) print;

            System.out.println(print);
        }
    }
}
