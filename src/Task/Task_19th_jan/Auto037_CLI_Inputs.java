package Task.Task_19th_jan;

import java.util.Scanner;

public class Auto037_CLI_Inputs {
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("please enter name age and salary as inputs ");
            return;
        }

        //step 1 - find out inputs and outputs
        //input - String -> name , byte -> Age, double -> Salary
        //Output - print name age and salary

        // step 2 - rough logic and write down tge logic
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float salary = Float.parseFloat(args[2]);

        if (age < 0 || age > 100)
        {
            System.out.println("\nEnter the correct age , this is the incorrect age ");
            return;
        }
         if (salary < 0.0 )
         {
             System.out.println("\nsalary should be only positive and must be within range ");
             return;
         }

        System.out.println("\nname :" + name + "\nage :" + age + "\nsalary :" + salary);

        // if values passed less than 3 then condition should added

        if (age < 0 || age > 100)
        {
            System.out.println("Enter the correct age , this is the incorrect age ");
        }
    }

    public static class Eligible_for_vote
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age ");
            if(!sc.hasNextInt())
            {
                System.out.println("only integers are allowed");
            }
            int age = sc.nextInt();

            if(age<0)
            {
                System.out.println("age can not be negative / < 0");
            } else if (age > 100)
            {
                System.out.println("too much age ");
            }
            else if (age==0)
            {
                System.out.println("age can not be 0");
            } else if (age > 18) {
                System.out.println("Allowed to vote");
            } else {
                System.out.println("not allowed");
            }
        }
    }
}

