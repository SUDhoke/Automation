package Ex_013_For_Each_Loop;

public class For_Each_practice
{
    public static void main(String[] args) {


        int[] array = {12,34,10};
        System.out.println(array.length);
        int sum1 = 0;

        for(int sum : array)
        {
            sum1 = sum1 + sum;

        }
        System.out.println(sum1);
        System.out.println("..........................");
        for(int i=0; i<array.length; i++)
        {
            sum1 = array[i] +sum1;
        }
        System.out.println(sum1);

        System.out.println(".............String.........");
        String s = "test";
        char[] c = s.toCharArray();
        System.out.println(c);

//        for(int i=0; i<s.length; i++)
//        {
//            System.out.println(s[i]);
//        }
    }
}
