package Ex_032_File_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling05_BufferedReader
{
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.println("enter name and age ");
        try {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            System.out.println(name+"\t"+age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
