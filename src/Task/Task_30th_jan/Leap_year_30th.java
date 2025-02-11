package Task.Task_30th_jan;

public class Leap_year_30th
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a year");
//        int year = sc.nextInt();
        int [] year = {2000, 2003, 2005};
        for(int years : year) {

            if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
                System.out.println( "Leap");
            } else {
                System.out.println("not a leap year ");
            }
        }
    }
}
