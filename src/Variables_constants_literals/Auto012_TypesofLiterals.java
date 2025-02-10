package Variables_constants_literals;

public class Auto012_TypesofLiterals
{
    public static void main(String[] args)
    {
       boolean b = true ;
       boolean b1 = false;
        //character literals

        char ch = 'A';
        char ch1 = '1';
        char ch2 = '\u0041';//unicode of character A



        //Escape char
        char new_line = '\n';
        char new_tab ='\t';
        char back_space ='\b';
        char carriage_return = '\r';

        String smiley = "\uD83D\uDE04";
        System.out.println(smiley);
        String S2 = "\u1F60A";
        System.out.println(S2);

        //integer literal
        int a = 23;
        long l =46l;

        //floating literal
        float f = 2.3f;
        double d= 23.02;
        double d1 =23.56D;
        //null literal

        String s1 = null;

        System.out.println(+ch);
        System.out.println(+a);
        System.out.println("boolean1 :" +b  +"\nboolean2 :"+b1);
        System.out.println(s1);




    }
}
