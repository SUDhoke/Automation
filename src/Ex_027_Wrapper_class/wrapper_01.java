package Ex_027_Wrapper_class;

public class wrapper_01 {
    public static void main(String[] args) {
        int a = 10;//primitive datatype
        //primitive data type
        //1.boolean - > true and false
        //2.Numeric datatype
        //numeric divided into two ->
        //floating point -> float(4 byte, 32 bit) and double(8 byte and 64 bit)
        //integral datatype ->byte(1 byte and 8 bit),short(2 byte and 16 bit), char(2 byte and 16 bit),
        // int(4 byte and 32 bit) , long(8 byte nad 64 bit)
        //need to avoid this primitive datatype and use the wrapper class

        //wrapper class - use to convert primitive datatype into object

        //example as below:
        Integer a1 = 100;
        String a2 = "20";
        System.out.println(Integer.valueOf(a1));
        System.out.println(Integer.parseInt(a2));
        System.out.println(a1.intValue());


    }
}
