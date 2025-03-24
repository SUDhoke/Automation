package Ex_028_Exception;

import java.util.Scanner;

public class try_catch_Exception_09_Finally
{
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int value = sc.nextInt();
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("exception message :"+e.getMessage());
        } finally {
            sc.close();
            System.out.println("closing the scanner");
        }
    }
}
