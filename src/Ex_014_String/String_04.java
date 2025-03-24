package Ex_014_String;

public class String_04 {
    public static void main(String[] args) {
        char c = 'A';
        char ch = 'D';
        System.out.println("char c :"+c+"\t"+"char ch :"+ch);

        System.out.println("------- ------- ------");
        String s1 = "Sonali";
        String str1 = "test";
        System.out.println(str1.length());
        System.out.println(s1.length());
        System.out.println("------- ------- ------");
        System.out.println(s1.toLowerCase());
        System.out.println(str1.toLowerCase());
        System.out.println("------- ------- ------");
        System.out.println(s1.toUpperCase());
        System.out.println(str1.toUpperCase());
        System.out.println("------- ------- ------");
        System.out.println(s1.concat(" Dhoke"));
        System.out.println(s1.concat(" "+str1));
    }
}
