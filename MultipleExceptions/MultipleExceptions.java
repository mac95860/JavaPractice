package MultipleExceptions;

import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
    public static void main(String[] args)  {
        Test test = new Test();

        // try {
        //     test.run();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (ParseException e) {
        //     // TODO Auto-generated catch block
        //     System.out.println("couldn't parse command file");
        // }

        // try {
        //     test.run();
        // } catch (IOException | ParseException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        try {
            test.run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
