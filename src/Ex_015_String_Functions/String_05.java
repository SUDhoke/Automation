package Ex_015_String_Functions;

public class String_05
{
    public static void main(String[] args) {

        String name = "Automation";
        String course_name = new String("Learning");

        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.append(" practice"));

//        System.out.println(sb.reverse());

        System.out.println(sb.insert(11," test "));

        System.out.println(sb.replace(0,10,"automation"));

        System.out.println(sb.delete(0,10));

        System.out.println(sb.length());

    }
}
