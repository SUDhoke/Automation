package Ex_018_OOPs_Constructor.Ex_018_OOPs_Constructor_class_objects;

import java.util.Scanner;

public class practice_con_class_obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name : ");
        String n1 = sc.nextLine();

        System.out.println("Enter age : ");
        int a1 = sc.nextInt();

        System.out.println("Enter grade : ");
        char g1 = sc.next().charAt(0);

        student s1 = new student(n1, a1, g1);
        s1.display();
    }
}

    class student {
        String name;
        int age;
        char grade;

        //param Constructor
        student(String name_c, int age_c, char grade_c)
        {
            System.out.println("parameterised constructor : Student details");
            this.name = name_c;
            this.age = age_c;
            this.grade = grade_c;

        }

        // method for display
         void display()
        {
            System.out.println("Student : Display Details (method)");
            System.out.println("Student_Name : " +name +"\n"+"Student_age : "+age+"\n"+"Student_grade : "+grade);
        }
    }
