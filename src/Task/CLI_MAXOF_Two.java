package Task;

public class CLI_MAXOF_Two
{
    public static void main(String[] args) {

         int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);

         String largest = (num1==num2)?"Both numbers are equal":(num1>num2)?"num1 is largest":"num2 is Largest";
        System.out.println("result :" +largest);

    }
}
