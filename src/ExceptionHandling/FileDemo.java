package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

       // try {
            FileInputStream fis = new FileInputStream("D:\\amol1.txt");
            System.out.println("File read successfully");
       /* }
        catch (Exception e)
        {
            System.out.println("File not found");
        }*/
    }
}
