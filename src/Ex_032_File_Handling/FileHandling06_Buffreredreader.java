package Ex_032_File_Handling;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling06_Buffreredreader
{
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        System.out.println("Enter name, age, salary");

        try {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());
            float salary = Float.parseFloat(reader.readLine());

            String print = name+"\t"+age+"\t"+salary+"\n";

            FileOutputStream output = new FileOutputStream("Data4.txt",true);
            output.write(print.getBytes());


            System.out.println(print);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
