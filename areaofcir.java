import java.util.*;

public class areaofcir{
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        System.out.print("Enter Radios: ");
        float rad = sc.nextFloat();

        System.out.println((pi * rad * rad));
    }
}