package Task.Task_05_Feb;

public class While_loop_multiplication_tableof7
{
    public static void main(String[] args) {
        int mul =0;
        int num =  7;
        int i = 1;
        while(i<=10) {

            mul = num * i;

            System.out.printf("%d * %d = %d", num, i, mul);
            i++;
            System.out.println("\n");

        }
    }
}
