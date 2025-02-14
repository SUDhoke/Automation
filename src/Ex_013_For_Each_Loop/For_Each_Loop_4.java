package Ex_013_For_Each_Loop;

public class For_Each_Loop_4
{
    public static void main(String[] args) {
        int[] sum = {10, 20, 30};

        int add = 0;

        for (int sum_all_arr : sum) {
            add = add + sum_all_arr;
            System.out.println(sum_all_arr);
        }
        System.out.println("Addition of all elements : " + add);
    }
}
