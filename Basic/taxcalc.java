import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR INCOME (Annual/Yearly): ");
        int income = scanner.nextInt();
        scanner.close();
        
        int tax = 0;
        
        if (income < 500000) {
            ; // Nothing to do
        } else if (income < 1000000) { 
            tax = 20;
            income = (int) (income - (income * 0.20)); 
        } else {
            tax = 30;
            income = (int) (income - (income * 0.30)); 
        }
        
        System.out.println("Government tax is "+ tax +"%, so your annual income after tax is " + income);
    }
}
