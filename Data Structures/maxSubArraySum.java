public class maxSubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        // subArr(numbers);
        prefixSum(numbers);
    }

    // Time complexity O(n^2) OPTIMIZED than subArr 
    public static void prefixSum(int numbers[]) {
        int maximum = Integer.MIN_VALUE;
        int n = numbers.length;
        int prefixSum[] = new int[n];
        prefixSum[0] = numbers[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
                
                if (maximum < currSum){
                    maximum = currSum;
                }
            }
        }
        System.out.println("MAX: "+ maximum);
    }
    

    // Time complexity O(n^3), which can be optimized further
    public static void subArr(int nums[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int subsum = 0;
                for (int k = start; k <= end; k++) {
                    subsum += nums[k];
                }
                System.out.println(subsum);
                if (subsum > maximum) {
                    maximum = subsum;
                }
            }
        }
        System.out.println("MAX: " + maximum);
    }
}
