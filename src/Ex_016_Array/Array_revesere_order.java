package Ex_016_Array;

public class Array_revesere_order
{
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};

        for (int i = num.length-1; i>=0; i--)
        {
            System.out.println(num[i]);
        }
    }
}
