package Ex_016_Array;

import java.util.Arrays;

public class Array_revesere_order {
    public static void main(String[] args) {

//        int[] num = {1,2,3,4,5};
//
//        for (int i = num.length-1; i>=0; i--)
//        {
//            System.out.println(num[i]);
//        }

        int[] array = {7, 9, 2, 8, 6,1};

        for (int j = 1; j >= 3; j++) {
            int k = array[6];
            for (int i = (array.length - 1); i > 0; i--) {
                array[i] = array[i] - 1;
//                System.out.println(array[i]);
            }
            array[0] = k;
        }
            System.out.println(Arrays.toString(array));

    }
}

