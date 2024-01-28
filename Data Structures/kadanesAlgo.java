public class kadanesAlgo {
    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        // int nums[] = { -2 , -3 , 4, -1, -2 , 1 , 5 , -3};
        int nags[] = { -2, -3, -4, -1 };
        // subArr(numbers);
        // prefixSum(numbers);
        Algo(nags);
    }

    public static void Algo(int nums[]) {
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
}
