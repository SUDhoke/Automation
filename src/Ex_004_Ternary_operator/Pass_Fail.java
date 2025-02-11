package Ex_004_Ternary_operator;

import java.util.Scanner;

public class Pass_Fail
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("marks");
        int marks = sc.nextInt();

        String result = (marks >=40)?"Pass":"Fail";
        System.out.println(result);
    }
}
