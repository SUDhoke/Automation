package Ex_013_For_Each_Loop;

public class For_Each_loop_countevenodd
{
    public static void main(String[] args) {
        //step 1 -> i/p array elements
        //step 1 -> o/p -> count of even number int even_c and count of odd_c int

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        int even_c = 0;
        int odd_c = 0;

        for(int c_even_odd_n : numbers)
        {

            if(c_even_odd_n%2==0)
            {
                even_c++;
            }else
            {
                odd_c++;
            }
        }

        System.out.println("Count Even :"+even_c);
        System.out.println("Count Odd : "+odd_c);
    }
}
