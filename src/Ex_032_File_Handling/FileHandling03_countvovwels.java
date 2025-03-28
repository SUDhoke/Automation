package Ex_032_File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling03_countvovwels
{
    public static void main(String[] args) {

        int count_vowels = 0;
        int count_all = 0;

        try {
            FileInputStream file3 = new FileInputStream("Data2.txt");

            int data;
            while((data = file3.read())!=-1)
            {
                count_all = count_all +1;
                System.out.println((char)(data));
                if((char)(data) == 'a'||(char)(data) == 'e' || (char)(data) == 'i'|| (char)(data) =='o'||(char)(data)=='u')
                {
                    count_vowels++;
                }
            }
            System.out.println(count_all);
            System.out.println(count_vowels);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
