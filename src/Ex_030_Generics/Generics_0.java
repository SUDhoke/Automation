package Ex_030_Generics;

public class Generics_0
{
    //this program is without generics have used the specified data types(Wrapper classes) in program as integer and String
    public static void main(String[] args) {
        System.out.println(temp_sum(4,50));
        System.out.println(temp_sum("Sonali", " Dhoke"));


    }
    static Integer temp_sum(Integer a, Integer b)
    {
        return a +b ;
    }
    static String temp_sum(String a, String b)
    {
        return a + b;
    }
}
