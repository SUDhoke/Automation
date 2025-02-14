package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

public class Function_SS_Count_Vowels
{
    public static void main(String[] args) {
        //count vowels in a string
        int s1 = Count_Vowels("test");
        System.out.println(s1);

    }

    static int Count_Vowels(String str)
    {
        int count_V = 0;
        int count_c = 0;
        int i = 0;
        char ch ;
        int len = str.length();
        str = str.toLowerCase();
        System.out.println(len);

        do{
            ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u')
            {
                count_V++;
            }
            i++;

        } while(len > i);

            return count_V;
    }

}
