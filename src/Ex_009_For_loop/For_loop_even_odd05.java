package Ex_009_For_loop;

public class For_loop_even_odd05
{
    public static void main(String[] args) {
        //find even and odd number between 1 - 20

        for(int i = 0 ; i<=20 ; i++)
        {
            if(i%2==0)
            {
                System.out.println("even: "+i);
            }else {
                System.out.println("odd: "+i);
            }
        }
    }
}
