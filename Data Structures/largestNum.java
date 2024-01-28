public class largestNum {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 23, 23, 232, 1, 1111, 3, 123, 123, 21, 312, 312, 1 };
        System.out.println("Largest Num is: " + largest(numbers));
    }
    
    public static int largest(int[] num) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }else if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number is: " + smallest);
        return largest;
    }
}

