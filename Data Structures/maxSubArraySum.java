public class maxSubArraySum {
    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // int nums[] = { -2 , -3 , 4, -1, -2 , 1 , 5 , -3};
        int nags[] = { -2, -3, -4, -1 };
        // subArr(numbers);
        // prefixSum(numbers);
        kadanesAlgo(nags);
    }

    public static void kadanesAlgo(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        // For Negative Numbers calculations
        int largestNegative = ms;
        int allNegative = 1;

        // Check if all nums are negative
        for (int i = 0; i < nums.length && allNegative == 1; i++) {
            if (nums[i] >= 0) {
                allNegative = 0;
            } else if (largestNegative < nums[i]) {
                largestNegative = nums[i];
            }
        }

        if (allNegative == 1) {
            ms = largestNegative;
        } else {
            for (int i = 0; i < nums.length; i++) {
                cs += nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
        }

        System.out.println("Out max subarray sum is: " + ms);
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

                if (maximum < currSum) {
                    maximum = currSum;
                }
            }
        }
        System.out.println("MAX: " + maximum);
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
