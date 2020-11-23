import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        //exceptions are part of error handling system
        File file = new File("Test.txt");

        try { 
            FileReader fr = new FileReader(file);

        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        }

        
    }
}
