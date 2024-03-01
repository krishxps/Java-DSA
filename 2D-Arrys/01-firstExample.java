import java.util.Scanner;

public class 01-firstExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter How Many students We Have: ");
        int studentAmt = sc.nextInt();
        System.out.print("Please Enter How Many Subjects We Have: ");
        int subAmt = sc.nextInt();
        
        int num[][] = new int[studentAmt][subAmt]; 

        get(num,studentAmt,subAmt,sc);
        print(num,studentAmt,subAmt);
        srch(num, studentAmt, subAmt, 21);
        sc.close();
    }
    public static void get(int[][] num,int studentAmt , int subAmt,Scanner sc) {
        for (int i = 0; i < studentAmt; i++) {
            System.out.println("Enter Student " + (i + 1) + " Subject Marks");
            for (int j = 0; j < subAmt; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                num[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void print(int[][] num,int studentAmt , int subAmt) {
        for (int i = 0; i < studentAmt; i++) {
            System.out.println("Student " + (i + 1) + " Subject Marks");
            for (int j = 0; j < subAmt; j++) {
                System.out.println("Subject " + (j + 1) + " Marks is " + num[i][j]); 
            }
            System.out.println();
        }
    }

    public static boolean srch(int[][] num,int studentAmt , int subAmt,int key) {
        for (int i = 0; i < studentAmt; i++) {
            for (int j = 0; j < subAmt; j++) {
                if(num[i][j] == key){
                    System.out.println("Found Number at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Find");
        return false;
    }
}
