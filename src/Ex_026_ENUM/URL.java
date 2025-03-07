package Ex_026_ENUM;

public class URL
{
    public static void main(String[] args) {
        System.out.println(URLS.rest);
        System.out.println("log out");
    }
}
//enum is the special datatype used to define collection of constants
enum URLS
{
    google,rest,katalon
}