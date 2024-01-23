public class dectobin {
    public static void main(String[] args) {
        System.out.println(decToBin(1023));
    }
    
    public static long decToBin(int n){
        long binary = 0;
        int placeValue = 1;
    
        while (n > 0) {
            int remainder = n % 2;
            binary += remainder * placeValue;
            n /= 2;
            placeValue *= 10;
        }
    
        return binary;
    }
    
}
