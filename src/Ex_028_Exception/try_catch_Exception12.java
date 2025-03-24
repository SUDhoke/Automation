package Ex_028_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class try_catch_Exception12
{
    public static void main(String[] args) {
        //checked exception
        try {
            FileReader file = new FileReader(new File("c://abc.text"));
        } catch (FileNotFoundException e) {
            System.out.println("meassage : "+e.getMessage());
        }
    }
}
