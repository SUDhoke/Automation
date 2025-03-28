package Ex_032_File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling01_ReadingData
{
    public static void main(String[] args)
    {
        try {

            FileInputStream file1 = new FileInputStream("Data.txt");

            int i ;
            while((i = file1.read())!=-1)
            {
                System.out.println((char)i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // to access the file must provide the path of the file


    }
}
