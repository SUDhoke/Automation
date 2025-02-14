package Ex_013_For_Each_Loop;

public class For_Each_loop_occurenceofchar
{
    public static void main(String[] args) {

        String str = "SonaliDhoke";
        char c = 'o';
        int count = 0;
        for(char count1 : str.toCharArray())
        {
//            count++;
//            System.out.println(count1);

            System.out.println("-----------------");
            if(count1 == c)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
