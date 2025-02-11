package EX_006_Type_Casting;

public class Auto035_Type_Casting
{
    public static void main(String[] args) {
        long ph_no = 2356498710l;
        short s = (short)ph_no;
        System.out.println(s); // here are the loss of data as we perform type_casting
        //for higher datatype to lower datatype as shown in above program
    }
}
