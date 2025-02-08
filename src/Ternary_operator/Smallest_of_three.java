package Ternary_operator;

public class Smallest_of_three
{
    public static void main(String[] args) {
         int num1 = 10;
         int num2 = 5;
         int num3 = 15;

         String result = (num1 < num2)?(num1 < num3)?"num1 is small":"Num3 is small" : (num2 < num3)?"num2 is small":"Num3 is small";
        System.out.println(result);
    }
}
