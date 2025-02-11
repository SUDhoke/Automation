package Ex_007_IF_Condition;

public class CLI_Input_IF
{
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age >= 18) {

            System.out.println("you are allowed to vote");
        }
    }
}
