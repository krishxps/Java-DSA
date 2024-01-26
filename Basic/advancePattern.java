public class advancePattern {
    public static void main(String[] args) {
        // frame(5,7);
        inveted(5);
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
