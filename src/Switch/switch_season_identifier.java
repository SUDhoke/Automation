package Switch;

import java.util.Scanner;

public class switch_season_identifier
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        if (sc.hasNextInt()) {
            int val = sc.nextInt();

            String season;
            switch (val) {
                case 1, 2, 3:
                    season = "winter";
                    break;
                case 4, 6, 5:
                    season = "spring";
                case 7, 8, 9:
                    season = "summer";
                    break;
                case 10, 11, 12:
                    season = "fall";
                    break;
                default:
                    season = "not a season";

            }
            System.out.println("season: " + season);
            sc.close();
        }else {
            System.out.println("only integers are allowed");
        }
    }
}
