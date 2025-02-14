package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

public class Functions_String_palindrome
{
    public static void main(String[] args) {
        //write a function that takes a string and returns true if it is a palindrome and return false

        //call the function

 String n_str = S_palindrome("mam");
 System.out.println(n_str);

    }

    static String S_palindrome(String str)
    {
        int  len = str.length();
        System.out.println(len);
        String reverse = "";
        char ch ;

        for(int i = 0; i<len; i++)
        {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
        if(str == reverse)
        {
            System.out.println("palindrome");
        }else
            System.out.println("not a palindrome");

        return reverse;
    }

}
