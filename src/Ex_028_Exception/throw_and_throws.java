package Ex_028_Exception;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class throw_and_throws
{
    public static void main(String[] args) {
        try {
            validate(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(Integer age) throws FileAlreadyExistsException,FileNotFoundException
    {
        if(age < 18)
        {
            //if we use throw in method signature then it will not give error
            //else we need to handle this by using try_catch block
            FileNotFoundException e1 = new FileNotFoundException();
            throw e1;
            //throw

//            ArithmeticException e = new ArithmeticException();
//            throw e;
            //generate exceptions


        }else {
            System.out.println("welcome");
        }
    }
}
