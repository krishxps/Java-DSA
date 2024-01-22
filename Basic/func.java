import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("FIRST NUMBER : ");
        int first = sc.nextInt();
        System.out.print("SECOND NUMBER : ");
        int second = sc.nextInt();

        sc.close();
        
        for (int i = 0; i < 10; i++) {
            sum = sum(first,second);
            first++;
            second++;
            System.out.println("Int I: "+i+", Sum :"+ sum);
        }
        
    }

    public static int sum(int a, int b) {
        return (a + b);
    }
    
}
