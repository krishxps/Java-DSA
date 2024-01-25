public class advancePattern {
    public static void main(String[] args) {
        frame(5,7);
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
