package For_loop;

import java.util.Scanner;

public class for_07_even_number_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i =1; i<=num; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }
}
