package Switch;

public class switch_Single_line
{
    public static void main(String[] args) {
        int itemcode=003;

        switch(itemcode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            default -> System.out.println("default");
        }
    }
}
