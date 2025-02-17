package Ex_015_String_Functions;

public class StringBuilder_02
{
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("sonali");
        str.append(" dhoke");
        System.out.println(str);

        StringBuilder test = new StringBuilder("hi");
        test.append(" Its a new Hello");
        System.out.println(test.toString());

        test.append(" boss");
        System.out.println(test);

        test.insert(2,",");
        System.out.println(test);

        test.replace(0,2,"hello");
        System.out.println(test);

        test.delete(0,7);
        System.out.println(test);

        test.reverse();
        System.out.println(test);
    }
}
