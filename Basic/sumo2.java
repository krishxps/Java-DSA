import java.util.Scanner;

public class sumo2{
    public static void main(String argc[]){

        System.out.print("A and B values: ");
        int first , second;
        Scanner sc = new Scanner(System.in);
        try {
            first = sc.nextInt();
            second = sc.nextInt();
            System.out.println(first + second);
        } catch (Exception InputMismatchException) {
            System.out.println("Please Enter Valid Input Moron");
        }
        sc.close();
        
    }
}