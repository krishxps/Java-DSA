public class pattern{
    public static void main(String argc[]){
        // <---------------------------------------------------->
        // OUTPUT:
        // *****
        // ****
        // ***
        // **
        // *
        // CODE:
        
        // for(int i = 0 ; i <  5; i++){
        //     for(int j = 5; j > (i); j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // <---------------------------------------------------->
        // OUTPUT:
        // *****
        // ****
        // ***
        // **
        // *
        // Code:

        // for(int i = 5 ; i > 0 ; i--){
        //     for(int j = 0; j < i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // <---------------------------------------------------->

        // Inverted Star Pattern
        // ****
        // ***
        // **
        // *

        // Outer loop Number of lines = 4
        // inner loop = value of lines
        // int n = 10;
        // for (int line = 1; line <= n; line++) {
        //     for(int star = 0; star <= (n - line); star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //Half pyramid output:
        // 1
        // 12
        // 123
        // 1234

        // int n = 4;
        // for (int line = 0; line < n; line++) {
        //     for(int star = 0; star <= line ;star++){
        //         System.out.print(star + 1);
        //     }
        //     System.out.println();
        // }

        // Character Pattern
        // OUTPUT: 
        // A
        // BC
        // DEF
        // GHIJ

        // int n = 4;
        // char A = 'A';
        // for (int line = 0; line < n; line++) {
        //     for(int star = 0; star <= line ;star++){
        //         System.out.print(A);
        //         A++;
        //     }
        //     System.out.println();
        // }
    }
}
