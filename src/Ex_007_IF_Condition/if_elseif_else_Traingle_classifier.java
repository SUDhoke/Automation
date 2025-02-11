package Ex_007_IF_Condition;

import java.util.Scanner;

public class if_elseif_else_Traingle_classifier
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        double side1 = sc.nextDouble();

        System.out.println("Enter side 2");
        double side2 = sc.nextDouble();

        System.out.println("Enter side 3");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        {
            System.out.println("not a valid side");
            return;
        }

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equilateral Traingle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("scalene Traingle");
            }

            sc.close();
        }
    }

