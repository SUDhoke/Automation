package Ex_013_For_Each_Loop;

public class For_Each_maximumnoArray
{
    public static void main(String[] args)
    {
        int [] max_array_element = {12,6,7,18,4,5,10,11};

        int consider_first_max = max_array_element[0];
        System.out.println("First Element at Index 0 : "+consider_first_max);
        int m = 1;
        for(int max : max_array_element)
        {
            System.out.println(max);

            if( consider_first_max <= max )
            {
              m = max;
            }

        }
        System.out.println("largest of all elements :"+m);

    }
}
