package Ex_010_While;

public class Multipleof5_upto50
{
    public static void main(String[] args) {
        int i = 1;

        while(i<=50)
        {
            if(i%5==0)
            {
                System.out.println(i);
                i++;
            }
        }
    }
}
