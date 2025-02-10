package Practice_Self_Study;

public class Max_three_ter
{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 16;

        String result = (num1 > num2)?((num1 > num3)?"num1":"num3") : (num2 > num3)?"num2":"num3";
        System.out.println(result);
    }
}
