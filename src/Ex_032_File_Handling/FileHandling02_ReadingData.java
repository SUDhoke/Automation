package Ex_032_File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling02_ReadingData
{
    public static void main(String[] args) {

        try {
            FileInputStream file2 = new FileInputStream("Data2.txt");
            int read_data;
            while((read_data = (file2.read()))!=-1)
            {
                System.out.println((char)read_data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
