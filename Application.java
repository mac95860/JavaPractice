import java.util.ArrayList;
import java.util.HashMap;

public class Application {

   //this is the main method that prints out to the console, all code is executed in here
   public static void main(String[] args) {

         ArrayList<String> strings = new ArrayList<String>();
         strings.add("cat");
         strings.add("dog");
         strings.add("alligator");

         String animal = strings.get(1);

         System.out.println(animal);

         HashMap<Integer, String> map = new HashMap<Integer, String>();
   }
}
