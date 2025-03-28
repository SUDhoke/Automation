package Ex_032_File_Handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling04_Scanner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age :");
        String name = sc.next();
        int age = sc.nextInt();

        String print = name+"\t"+age+"\n";

        try {
            FileOutputStream write = new FileOutputStream("Data3.txt");
            write.write(print.getBytes());
            System.out.println(print);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
