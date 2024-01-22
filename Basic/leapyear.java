import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YEAR TO CHECK THIS IS LEAP YEAR OR NOT: ");
        int leap = sc.nextInt();
        sc.close();
        boolean isLeapYear = false;

        if (leap % 4 == 0) {
            if (leap % 100 != 0 || leap % 400 == 0) {
                isLeapYear = true;
            }
        }

        String s = isLeapYear? " ": " NOT ";
        System.out.println("THIS IS" + s +"LEAP YEAR");
        
    }
}
