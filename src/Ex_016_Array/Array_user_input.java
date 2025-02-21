package Ex_016_Array;

import java.util.Scanner;

public class Array_user_input
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        for(int i =0; i<arr.length; i++)
        {
            System.out.println("Enter the number : ");
            arr[i]= sc.nextInt();
        }
        System.out.println(".........");

        for(int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
