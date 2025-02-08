package Task;

public class Largest_three_no
{
    public static void main(String[] args) {
        //step1 - > find out i/p and o/p
        //i/p ->three numbers num1,num2,num3 -> datatype -> int
        //o/p -> largest number out of three

        //step2- rough logic
        //num1 > num2 check num1 > num3 -> num1 is large
        //num2 > num3 -> num2 is large
        //num 3 is large

        //step3 - write logic
        int num1 = 15 ;
        int num2 = 5;
        int num3 = 10;

       if(num1 > num2 && num1 > num3)
       {
           System.out.println("num1 is largest");
       } else if (num2 > num3) {
           System.out.println("num2 is largest");

       }else {
           System.out.println("number3 is largest");
       }


    }
}
