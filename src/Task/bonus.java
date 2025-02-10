package Task;

import java.util.Scanner;

public class bonus
{
    public static void main(String[] args) {


    //user i/p -> salary and year
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        System.out.println("Enter year of experience");
        float E_year = sc.nextFloat();

        double bonus;

        if(E_year<1)
        {
            System.out.println("there is no bonus for less than 1 year");
            System.out.println("Salary : "+salary);
        } else if (E_year>=1 && E_year<=3)
        {
        bonus = (5 * salary)/100;
        salary = salary+bonus;
            System.out.println("Bonus for year between 1 and 3 :"+bonus);
            System.out.println("Salary : "+salary);
        } else if (E_year>=4 && E_year <=6)
        {
         bonus = (10 * salary) / 100;
         salary = salary + bonus;
            System.out.println("Bonus for the year 4 to 6 : "+bonus +"\t" + "salary :"+ salary);

        }else if (E_year>6)
        {
            bonus = (15 * salary) /  100;
            salary = salary + bonus;
            System.out.println("Bonus for more than 6 year : "+bonus +"\t" + "Salary :"+salary);
        }

    }
    }
