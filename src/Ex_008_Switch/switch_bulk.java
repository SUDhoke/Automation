package Ex_008_Switch;

public class switch_bulk {
    public static void main(String[] args) {

        //above jdk13 concept

        int itemcode = 003;

        switch (itemcode)
        {
            case 001,002:
                System.out.println("elc");
                break;
            case 003,004:
                System.out.println("mech");
                break;
            default:
                System.out.println("not applicable");

        }
    }
}
