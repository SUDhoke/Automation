package Task;

import java.util.Scanner;

public class Auto040_Gragde_cal_Ternary_operator {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained score");

        if (sc.hasNextInt()) {

            score = sc.nextInt();

            if (score <0 || score >100)
            {
                System.out.println("invalid input");
                return;
            }
            String grade = ((score >= 90 && score <= 100) ? "A" : (score >= 80 && score <= 89) ? "B" : (score >= 70 && score <= 79) ? "C" : (score >= 60 && score <= 69) ? "D" : "fail");
            System.out.println("grade is : " + grade);
        }
    }
}



