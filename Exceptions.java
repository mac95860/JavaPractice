import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws FileNotFoundException {
        //exceptions are part of error handling system
        File file = new File("Test.txt");

        Scanner in = new Scanner(file);

        int value = in.nextInt();
        int count = 2;
        System.out.println("Read value: " + value);

        in.nextLine();

        try { 
            FileReader fr = new FileReader(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(count + ": " + line);
                count++;
            }

            in.close();
           
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } 
    }
}
