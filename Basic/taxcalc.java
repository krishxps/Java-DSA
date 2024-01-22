import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR INCOME (Annual/Yearly): ");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("Government tax is 0%, so your annual income is " + income);
        } else if (income < 1000000) {
            double taxAmount = income * 0.20; 
            System.out.println("Government tax is 20%, so your annual income is " + (income - taxAmount));
        } else {
            double taxAmount = income * 0.30; 
            System.out.println("Government tax is 30%, so your annual income is " + (income - taxAmount));
        }
    }
}
