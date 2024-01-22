import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide Number to reverse: ");
        int num = sc.nextInt();
        sc.close();

        // // Rev Print
        // int temp = 0;
        // System.out.print("Reversed Num: ");
        
        // while (num > 0) {
        //     temp = num % 10;
        //     System.out.print(temp);
        //     num = num / 10;
        // }
        // System.out.println();

        // Rev Variable Value 
        int rev = 0;

        while (num > 0) {
            rev = (rev * 10 ) + num % 10;
            num = num / 10;
        }
        
        num = rev;
        System.out.println("Reversed Num: " + rev);
    }
}
