public class advancePattern {
    public static void main(String[] args) {
        // frame(5,7);
        // inveted(5);
        // invetedNum(5);
        floidTriangle(5);
    }

    public static void floidTriangle(int line){
        // OUTPUT: (5)
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 

        int counter = 0; // TO TRACK PRINT NUMBER
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(++counter + " "); // ++ Will Update number before print
            }
            System.out.println();
        }
    }

    public static void invetedNum(int line){
        // OUTPUT: (5)
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for (int i = 0; i < line; i++) {
            for (int j = 0 ; j < line - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void inveted(int line){
        // OUTPUT : (5):   
        //     *
        //    **
        //   ***
        //  ****
        // *****
        line++;
        for (int i = 1; i < line; i++) {
            for (int j = 1; j < line - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void frame(int n, int m) {
        // OUTPUT:(5,5)
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int Line = 1; Line <= n; Line++) {
            for (int Raw = 1; Raw <= m; Raw++) {
                if (Line == 1 || Line == n || Raw == 1 || Raw == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
