package Ex_010_While;

public class while_05_Even_no
{
    public static void main(String[] args) {

        int i = 1;
        int j = 0;

        while(i<=20)
        {
            if(i%2==0)
            {
                System.out.println("Even : "+i);
            }
            i++;
        }
    }
}
