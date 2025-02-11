package Ex_012_Functions;

import java.time.LocalDate;
import java.time.LocalTime;

public class Functions_001_pre_defined
{
    public static void main(String[] args) {
        //pre-defined functions are functions that are already available in java

        int result = Math.max(3,5);
        System.out.println(result);

        int min = Math.min(2,5);
        System.out.println(min);

        LocalDate res1 = LocalDate.now();
        System.out.println(res1);

        LocalTime LT = LocalTime.now();
        System.out.println(LT);


    }
}
