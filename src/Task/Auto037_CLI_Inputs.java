package Task;

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
}

