package Ex_028_Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cusom_Exception_File_mgt_sys
{
    public static void main(String[] args) {
        try {

            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);

            System.out.println("Enter the role (Admin,user,guest)");
            String role = reader.readLine();

            FileAccess FA = new FileAccess();
            FA.accessfile("a.log",role);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
class FileAccess
{
    String Filename;
    String role;

    public void accessfile(String filename, String role) throws UnauthorizedAccess
    {
        if(role.equalsIgnoreCase("admin"))
        {
            System.out.println("You can access the file");
        }else {
            UnauthorizedAccess una = new UnauthorizedAccess("can not access the file");
            throw una;
        }
    }
}
class UnauthorizedAccess extends Exception{
    UnauthorizedAccess(String Exception_message)
    {
        super(Exception_message);
    }
}