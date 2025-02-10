package Switch;

import java.util.Scanner;

public class switch_trafilc_light_system
{
    public static void main(String[] args) {
        //step 1 - i/p -> byte -> colour code
        //o/p -> string -> red,yellow,green -> display an action

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a colour code");
        if(sc.hasNextByte()) {
            byte colour_code = sc.nextByte();

            String action = " ";

            switch (colour_code) {
                case 1:
                    System.out.println("Red");
                    action = "Stop";
                    break;
                case 2:
                    System.out.println("Yellow");
                    action = "Get Ready";
                    break;
                case 3:
                    System.out.println("Green");
                    action = "Go";
                    break;
                default:
                    System.out.println("not applicable");
                    break;
            }
            System.out.println("Action according to traffic light : " +action);
        }else{
            System.out.println("invalid input");
        }

    }

}
