package Ex_028_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Exception13
{
    public static void main(String[] args) throws FileNotFoundException
    {
        try {
            FileInputStream f1 = new FileInputStream("c://abc.log");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
