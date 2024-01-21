// Importing Java scanner function to take inputs from user
import java.util.*;

public class test{
    public static void main(String argc[]){
        System.out.print("Your Name: ");
        // Java scanner function to take inputs from user
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        System.out.println("Hello, " + s);
    }
}