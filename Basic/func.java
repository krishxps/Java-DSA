import java.util.Scanner;

public class func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float sum = 0;
        int sum = 0;

        // System.out.print("FIRST NUMBER : ");
        // int first = sc.nextInt();
        // System.out.print("SECOND NUMBER : ");
        // int second = sc.nextInt();
        // float first = 1.1f;
        // float second = 2.1f;
        int first = 1;
        int second = 2;
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

    public static float sum(float a, float b) {
        return (a + b);
    }
    
}
