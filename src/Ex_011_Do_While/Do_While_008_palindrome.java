package Ex_011_Do_While;

public class Do_While_008_palindrome
{
    public static void main(String[] args) {

        //step 1 -> i/p and o/p
        //i/p a number -> int
         int num = 121;

         //o/p -> palindrome - after reversing it should be the same number
        int reverse = 0;
        int ori_num = num;
        //step2 - logic
        do
        {
            int last = num%10 ;
            reverse = (reverse*10) + last ;
            num = num / 10;

        }while(num > 0);
        System.out.println(reverse);
    }
}
