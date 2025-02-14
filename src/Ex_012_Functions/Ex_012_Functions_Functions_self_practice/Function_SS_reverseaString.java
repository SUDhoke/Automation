package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

public class Function_SS_reverseaString
{
    public static void main(String[] args) {
        //sonali - i/p a string
        //ilanos - o/p a string

        //calling of a function

        String result_reverse = S_reverse("mona");
        System.out.println(result_reverse);

    }

    static String S_reverse(String s1)
    {
        String reverse = "";
        for (int i = 0; i<s1.length(); i++)
        {
            char c = s1.charAt(i);
            reverse = c + reverse;
        }
        return reverse;
    }

}
