package Ex_012_Functions;

public class Functions_006_WPWRT
{
    public static void main(String[] args) {
        //User define - type 4 - with parameter and with return type
        //calling function

        String Details = function_one("sonali","Dhoke");
    }

    //create function one

    static String function_one(String name, String L_name)
    {
        System.out.println("Details : "+name + "\t" +L_name);
        return L_name;
    }
}
