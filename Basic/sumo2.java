import java.util.*;

public class sumo2{
    public static void main(String argc[]){

        System.out.print("A and B values: ");

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        
        sc.close();
        System.out.println(first + second);
    }
}