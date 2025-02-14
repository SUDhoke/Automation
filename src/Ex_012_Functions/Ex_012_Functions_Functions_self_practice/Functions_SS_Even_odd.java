package Ex_012_Functions.Ex_012_Functions_Functions_self_practice;

import javax.swing.*;

public class Functions_SS_Even_odd
{
    public static void main(String[] args) {

        //even and add program by functions
        boolean result = isEven(56);
        System.out.println(result);
    }

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
