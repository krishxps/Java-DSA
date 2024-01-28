public class maxSubArraySum {
    public static void main(String[] args) {
        int numbers[] = { 1 , -2 , 6 , -1 ,3};
        subArr(numbers);
    }
    
    // time complexity n3 which is bad
    public static void subArr(int nums[]){
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
                if(subsum > maximum){
                    maximum = subsum;
                }
            }
        }
        System.out.println("MAX: " + maximum);
    }
}
