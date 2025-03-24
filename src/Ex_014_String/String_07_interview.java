package Ex_014_String;

public class String_07_interview
{
    public static void main(String[] args) {


    String s1 ="Hello"; //SCP - checks if the string is already is present or
    // not if present then print that if not create new string
    String s4 ="Hello";
    String s10 = "hello";

    String str1 = new String("Hello");//different present in OA(object area) always creates new string
    String str2 = new String("Hello");

        System.out.println(s1 == s4);
        System.out.println("--- --- ---");
        System.out.println(s4 == s10);
        System.out.println("--- --- ---");
        System.out.println(s1 == str1);
        System.out.println("--- --- ---");
        System.out.println(str1 == str2);

        //equals - pre defined functions
        System.out.println();
        System.out.println("Equals pre-defined function");
        System.out.println(s1.equals(s4));
        System.out.println("--- --- ---");
        System.out.println(s1.equalsIgnoreCase(s10));
        System.out.println("--- --- ---");
        System.out.println(s1.equals(str1));
        System.out.println("latest................");
        String str_01 ="test";
        String str_02 ="Test";
        String str_03 = "test";
        String str = new String("Test");
        System.out.println(str_01==str_03);
        System.out.println(str_02==str_03);
        System.out.println(str_01.equals(str_03));
        System.out.println(str.equalsIgnoreCase(str_03));




}
}
