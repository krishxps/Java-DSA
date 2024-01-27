public class advancePattern {
    public static void main(String[] args) {
        // frame(5,7);
        // inveted(5);
        // invetedNum(5);
        // floidTriangle(5);
        // zeroOneTriangle(5);
        // butterfly(5);
        // solidRhombus(10);
        // hollowRhombus(5);
        dimond(5);
    }

    public static void dimond(int number) {
        //OUTPUT: (5)
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for (int i = 1; i <= number; i++) { // Upper Half
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number - 1; i >= 0; i--) { // Second Half
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int number) { 
        // OUTPUT: (5)
        //     *****
        //    *   *
        //   *   *
        //  *   *
        // *****
        for (int i = 1 ; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            if(i == 1 || i == number){
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int j = 1; j < (number - 1); j++) {
                System.out.print(" ");
                }
                System.out.print("*");
            }   
            System.out.println();
        }
    }

    public static void solidRhombus(int number) {
        //OUTPUT: (5)
        //         * * * * * 
        //       * * * * * 
        //     * * * * * 
        //   * * * * * 
        // * * * * * 
        for (int i = 1 ; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int number) {
        // OUTPUT: (5)
        // *                 * 
        // * *             * * 
        // * * *         * * * 
        // * * * *     * * * * 
        // * * * * * * * * * * 
        // * * * * * * * * * * 
        // * * * *     * * * * 
        // * * *         * * * 
        // * *             * *
        // *                 *
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (2 * (number - i)); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = number ; i > 0 ; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (2 * (number - i)); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int line) {
        // OUTPUT: (5)
        // 1 
        // 0 1 
        // 0 1 0 
        // 1 0 1 0 
        // 1 0 1 0 1 
        Boolean idx = true;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                if(idx){
                    System.out.print("1 ");
                    idx = !idx;
                }else{
                    System.out.print("0 ");
                    idx = !idx;
                }
            }
            System.out.println();
        }
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
