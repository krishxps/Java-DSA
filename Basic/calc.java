// import java.util.Scanner;

// public class calc{
//     public static void main(String argc[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input Two Values: ");
//         int first = sc.nextInt();
//         int second = sc.nextInt();

//         System.out.print("Input Operation: ");
//         String s = sc.next();

//         System.out.print("Result: ");
//         switch(s){
//             case "*":
//                 System.out.println(first * second);
//                 break;
//             case "+":
//                 System.out.println(first + second);
//                 break;
//             case "-":
//                 System.out.println(first - second);
//                 break;
//             case "/":
//                 System.out.println(first / second);
//                 break;
//             default:
//                 System.out.println("ERROR: Input Valid Operation");
//         }
        
//     }
// } 

import java.util.Scanner;

public class calc{
    public static void main(String argc[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Two Values with Operation (Ex: 2 * 2): ");
        int first = sc.nextInt();
        String s = sc.next();
        int second = sc.nextInt();
        
        sc.close();
        System.out.print("Result: ");
        switch(s){
            case "*":
                System.out.println(first * second);
                break;
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("ERROR: Input Valid Operation");
        }
        
    }
}   