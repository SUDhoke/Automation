package Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto038_User_inputs_SacnnerClass
{
    public static void main(String[] args)
    {


        //step 1 : find out i/p and o/p
        // inputs - name, age and salary
        // o/p print all the details

        // step 2 rough logic
        // take i/p from user by using scanner class
        // print using println

        //step 3: write logic

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = sc.nextLine();

        if (name.isBlank())
        {
            System.out.println("name can not be blank");
            return;

        }

            if (name.matches(".*\\d.*"))
            {
                System.out.println("Error: Name cannot contain numeric values.");
                return;
            }

   try {
            System.out.println("Enter age ");
            int age = sc.nextInt();
            if (age <= 18 || age > 100)
            {
                System.out.println("Enter valid age from  18 to 100 only");
                return;
            }
            System.out.println("Enter salary");
            float salary = sc.nextFloat();
            if (salary <= 10000 || salary >=80000)
            {
                System.out.println("not allowed to enter between 10000 and 80000");
                return;
            }
            System.out.println("details :" + name + "\t" + age + "\t" + salary);

         }
   catch (InputMismatchException e) {
             System.out.println("please enter valid numeric value for age and salary");
             return;

         }
        sc.close();


    }

    public static class EVEN_ODD
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int number = sc.nextInt();

            if(number%2==0)
            {
                System.out.println("even");
            }else
            {
                System.out.println("odd");
            }
        }
    }
}
