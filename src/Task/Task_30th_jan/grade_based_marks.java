package Task.Task_30th_jan;

import java.util.Scanner;

public class grade_based_marks
{
    public static void main(String[] args) {
        //step1 -> i/p -> marks between  to 0 to 100
        // o/p -> grades A+ A B C D E fail
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        if(!sc.hasNextInt())
        {
            System.out.println("int only");
            return;
        }
        int marks = sc.nextInt();
        if(marks > 100 || marks <0)
        {
            System.out.println("these i/p are not allowed to enter");
            return;
        }

        if(marks >=90 && marks <=100)
        {
            System.out.println("A+");
        } else if (marks >= 80 && marks<=89 )
        {
            System.out.println("A");
        } else if (marks >=70 && marks<=79)
        {
            System.out.println("B");
        } else if (marks >= 60 && marks <=69)
        {
            System.out.println("C");
        } else if (marks >=50 && marks <=59)
        {
            System.out.println("D");
        } else if (marks >=40 && marks <=49)
        {
            System.out.println("E");
        } else if (marks <40)
        {
            System.out.println("Fail");
        }
    }
}