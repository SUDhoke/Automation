package Ex_016_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {
        int[] array = {5, 6, 1, 0, 2, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //second last element

        System.out.println(array[array.length - 2]);
    }
}
