package Practice_Self_Study;

public class String_character_occurence {


public static void main(String[] args)
{
    String name ="Sonaliaaaaa";
    int[] freq = new int[256];

    for(char ch : name.toCharArray())
    {
        freq[ch]++;

    }
    for(int i = 0 ; i < freq.length; i++)
    {
        if(freq[i] > 0)
        {
            System.out.println(freq[i]);
        }
    }

}
}