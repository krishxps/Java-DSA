public class printSubArray {
    public static void main(String[] args) {
        int numbers[] = { 2 , 4, 6 ,8 ,10};
        subArr(numbers);
    }
    
    public static void subArr(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
