public class pairs {
    public static void main(String[] args) {
        int numbers[] = { 2 , 4, 6, 8 ,10};
        printPairs(numbers);
    }
    
    public static void printPairs(int num[]) {
        int totalPair = 0;
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            for (int j = 1+i; j < num.length; j++) {
                System.out.print("(" + current + "," + num[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS: " + totalPair + "\n");
    }
}
