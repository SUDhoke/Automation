package Ex_004_Ternary_operator;

public class no_zero_NonZero
{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        String ZNZ = (num==0)?"Zero":"non Zero number";
        System.out.println(ZNZ);

    }
}