package Ex_028_Exception;

import java.io.File;
import java.io.FileNotFoundException;

import static Ex_028_Exception.throws_ex.age;

public class throw_throws_Exception_05 {
    public static void main(String[] args) throws FileNotFoundException {
        age(18);
        FileNotFoundException file = new FileNotFoundException("C://a.log");;
    }
}
class throws_ex
{
    static void age(Integer age)
    {
        if (age < 18)
        {
           try {
               throw new exc("age is less than 18");
           }catch (Exception e)
           {
               System.out.println(e.getMessage());
           }
        }
    }
}
 class exc extends Exception
{
    exc(String msg) {
        super();
    }
}