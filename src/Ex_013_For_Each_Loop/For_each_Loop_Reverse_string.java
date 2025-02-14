package Ex_013_For_Each_Loop;

public class For_each_Loop_Reverse_string
{
    public static void main(String[] args) {

        String input = "JAVA";
        String reverse = "";

        for(char str : input.toCharArray())

        {
            System.out.println(str);
            reverse = str + reverse;
        }
        System.out.println(reverse);
    }
}
