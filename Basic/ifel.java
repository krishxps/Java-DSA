import java.util.Scanner;

public class ifel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Input Age: ");
        int a = scanner.nextInt();
        scanner.close();

        if(a <= 10){
            System.out.println("Age is " + a);
        }
        else{
            System.out.println("ERROR: Give valid Kid age");
        }
    }
}
