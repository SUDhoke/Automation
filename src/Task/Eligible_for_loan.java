package Task;

import java.util.Scanner;

public class Eligible_for_loan {
    public static void main(String[] args) {
        //user i/p for age , salary and credit_score
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age (Integer)");
        if (!sc.hasNextInt())
        {
            System.out.println("Only Integers are allowed to enter");
        }
        int age = sc.nextInt();

        if(age<=0 || age < 18)
        {
            System.out.println("Error : Age : age should be positive Integer and greater than 18");
            return;
        } else if (age >80)
        {
            System.out.println("Error : Age : Max age can be 80");
            return;
        }

        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        if (salary <=0)
        {
            System.out.println("Error : Salary : salary can not be 0 and less than 0");
            return;
        } else if (salary >30000)
        {
            System.out.println("Error : salary : minimum salary threshold is 30000");
            return;
        }
        System.out.println("Enter Credit Score");
        int credit_score = sc.nextInt();

          if (credit_score <=0)
        {
            System.out.println("Error : credit_score : credit score can not be less than 0 or 0");
            return;
        } else if (credit_score <650)
        {
            System.out.println("Error : credit score : credit score can not be less than 650");
            return;
        } else if (credit_score >850)
        {
            System.out.println("Error : Credit score : Max credit score threshold 850");
            return;
        }
        
        //validating conditions
        if (age >=18 && age <=80 && salary <=30000 && salary>0 && credit_score >=650 && credit_score <=850)
        {
            System.out.println("You are Eligible for loan");
        }else
        {
            System.out.println("you are Not eligible for Loan");
        }
        
    }
}
