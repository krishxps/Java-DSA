import java.util.Scanner;

public class taxcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR INCOME (Annual/Yearly): ");
        int income = scanner.nextInt();
        scanner.close();
        
        float tax = 0;
        int taxAm = 0;

        if (income < 500000) {
            ; // Nothing to do
        } else if (income < 1000000) { 
            tax = 0.20f;    
        } else {
            tax = 0.30f;
        }
        taxAm = (int) (income * tax);
        income = (int) (income - taxAm);
        System.out.println("Government tax is "+ ((int)(tax * 100)) +"% ("+ taxAm +"$), so your annual income after tax is " + income);
    }
}
