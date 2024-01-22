import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR INCOME (Annual/Yearly): ");
        int income = scanner.nextInt();
        scanner.close();
        
        int tax = 0;
        int taxAm = 0;

        if (income < 500000) {
            ; // Nothing to do
        } else if (income < 1000000) { 
            tax = 20;
            taxAm = (int) (income * 0.20);
            income = (int) (income - taxAm);
        } else {
            tax = 30;
            taxAm = (int) (income * 0.30);
            income = (int) (income - taxAm); 
        }
        
        System.out.println("Government tax is "+ tax +"% ("+ taxAm +"$), so your annual income after tax is " + income);
    }
}
