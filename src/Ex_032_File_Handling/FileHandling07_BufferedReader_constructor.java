package Ex_032_File_Handling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Movie
{
    String Movie_name;
    float rating;

    public Movie(String movie_name, float rating) {
        Movie_name = movie_name;
        this.rating = rating;
    }
    public String toString()
    {
        return Movie_name+"\t"+rating+"\n";
}
}
public class FileHandling07_BufferedReader_constructor
{
    public static void main(String[] args) {

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        System.out.println("Enter Movie name and rating ");

        try {
            String movie_name = reader.readLine();
            float rating = Float.parseFloat(reader.readLine());

            String print_data = movie_name+"\t"+rating+"\n";
            //if file is not present then fileoutputstream will create a new ile
            FileOutputStream enter_data_into_file = new FileOutputStream("Data5.txt",true);
            //write data
            enter_data_into_file.write(print_data.getBytes());

            Movie m = new Movie(movie_name,rating);
            System.out.println(m.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
