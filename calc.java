import java.util.*;

public class calc{
    public static void main(String argc[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Two Values: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.print("Input Operation: ");
        String s = sc.next();

        switch(s){
            case "*":
                System.out.println(first * second);
                break;
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("ERROR: Input Valid Operation");
        }
        
    }
}   