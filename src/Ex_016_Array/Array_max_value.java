package Ex_016_Array;

public class Array_max_value
{
    public static void main(String[] args) {

        int[] array = {25,14,56,15,36,77,18,29,49};

        int result = give_max(array);
        System.out.println(result);

    }

    static int give_max(int[] array)
    {
        int max = array[0];
        for(int i=0; i<array.length; i++)
        {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
