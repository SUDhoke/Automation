package Task.Task_01_Feb;

import java.util.Scanner;

public class person_Age_Senior_citizen
{
    public static void main(String[] args) {

        //find a person senior citizen based on age
         //take input for user -> int age

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check a person is senior citizen");
        if(!sc.hasNextInt())
        {
            System.out.println("Age should be in Int only");
            System.exit(0);
        }
        int Age = sc.nextInt();

        //step 1 - find out o/p -> senior citizen age > 65 and older

        //step2 - logic building

        String Category = " ";

        if(Age >=0 && Age <=12)
        {
            Category = "child";
            System.out.println(Category);
        } else if (Age >=13 && Age <=19)
        {
         Category = "Teenager";
         System.out.println(Category);
        } else if (Age >=20 && Age <=64)
        {
         Category = "Adult";
         System.out.println(Category);
        }else
        {
            Category = "Senior";
            System.out.println(Category);
        }
        sc.close();
    }
}
