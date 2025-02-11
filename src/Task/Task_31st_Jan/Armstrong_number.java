package Task.Task_31st_Jan;

public class Armstrong_number
{
    public static void main(String[] args) {
        int num = 153;
        int c_digit = 0;
//        c_digit = String.valueOf(num).length();
//        System.out.println(c_digit);

        while(num != 0)
        {
            num=num/10;
            c_digit++;
        }
        System.out.println(c_digit);
    }
}
