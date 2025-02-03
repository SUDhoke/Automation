package While;

public class while_odd_1to20
{
    public static void main(String[] args) {
        int num = 1;

        while(num<=20)
        {
            if(num%2!=0)
            {
                System.out.println("Odd :" +num);
            }
            num++;
        }
    }
}
