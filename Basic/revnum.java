import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide Number to reverse: ");
        int num = sc.nextInt();
        int temp = 0;
        sc.close();
        System.out.print("Reversed Num: ");
        while (num > 0) {
            temp = num % 10;
            System.out.print(temp);
            num = num / 10;
        }
        System.out.println();
        
    }
}
