public class binarySearch {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14};
        System.out.println("Index of key (-1 if not found): "+ Binary(nums, 14));
    }

    // Prerequisite : Sorted Array
    public static int Binary(int numbers[],int key) {
        // Starting Of search
        int start = 0;
        // Ending of search { -1 for index outbound error}
        int end = numbers.length - 1;

        // Until Start is smaller than end
        while (start <= end) {
 
            // Finding mid to compare 
            int mid = (start + end) / 2;

            // If mid is number we want then found
            if(numbers[mid] == key){
                return mid;
            } 
            // If mid is greater than key then end becomes mid
            else if(numbers[mid] > key){ // left
                end = mid - 1;
            }
             // if mid is smaller than start becomes mid 
            else if(numbers[mid] < key){ // right [We can use simple else also]
                start = mid + 1;
            }
        }
        return -1;
    }
}
