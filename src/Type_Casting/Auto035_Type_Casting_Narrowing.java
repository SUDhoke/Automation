package Type_Casting;

public class Auto035_Type_Casting_Narrowing
{
    public static void main(String[] args) {
        short s = 10;
        //byte b = s;//invalid - implicit casting narrowing is not possible
        byte b = (byte)s;// valid explicit casting is allowed
        System.out.println(b);

    }
}
