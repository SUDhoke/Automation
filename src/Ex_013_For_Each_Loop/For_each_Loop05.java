package Ex_013_For_Each_Loop;

public class For_each_Loop05
{
    public static void main(String[] args)
    {
        int [] count_even = {5,10,6,7,9,11};
        int count = 0;
        for(int num : count_even)
        {
            if(num%2==0)
            {
                count++;
            }
            System.out.println(num);
        }
        System.out.println("----------------");

        System.out.println(count);
    }
}
