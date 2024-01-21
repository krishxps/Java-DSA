// Importing Java scanner function to take inputs from user
import java.util.*;

public class test{
    public static void main(String argc[]){

        System.out.print("Your Name: ");
        // Java scanner function to take inputs from user
        Scanner sc = new Scanner(System.in);

        // Capture input till space
        // String s = sc.next();

        // Capture input till Next Line
        String k = sc.nextLine();
        System.out.println("Hello, " + k);
    }
}