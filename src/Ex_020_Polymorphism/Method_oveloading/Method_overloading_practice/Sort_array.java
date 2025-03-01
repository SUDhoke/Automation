package Ex_020_Polymorphism.Method_oveloading.Method_overloading_practice;

import java.util.Arrays;

public class Sort_array {
    public static void main(String[] args) {
        sorted s = new sorted();
        int[] a1 = {9, 6, 7, 8, 5};
        s.asort(a1);
    }

    static class sorted {
      public static void asort(int[] arr) {
            Arrays.sort(arr);
            System.out.println("Sorted array integer : " + Arrays.toString(arr));
        }

       public static void asort(String[] arr) {
            Arrays.sort(arr);
            System.out.println("String sorted array : " + Arrays.toString(arr));
        }
    }
}
