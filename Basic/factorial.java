import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num = getInput();
        System.out.println("Factorial is: " + factorialFind(num));
    }

    public static long factorialFind(int number) {
        if (number == 0) {
            return 1;
        }
        long result = 1;
        while (number > 0) {
            result *= number;
            number--;
        }
        return result;
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("ENTER NUMBER: ");

        do {
            num = sc.nextInt();
            if (num < 0) {
                System.out.print("Please Enter Positive Number: ");
            }
        } while (num < 0);

        sc.close();

        return num;
    }

}
