import java.util.Scanner;

public class areaofcir{
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        System.out.print("Enter Radios: ");
        float rad = sc.nextFloat();
        
        sc.close();
        System.out.println((pi * rad * rad));
    }
}