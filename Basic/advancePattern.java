public class advancePattern {
    public static void main(String[] args) {
        frame(5);
    }

    public static void frame(int n) {
        // OUTPUT:
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for (int Line = 1; Line <= n; Line++) {
            for (int Raw = 1; Raw <= n; Raw++) {
                if (Line == 1 || Line == n || Raw == 1 || Raw == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
