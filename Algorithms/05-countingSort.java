package Algorithms;

public class countingSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        counting(arr);
        print(arr);
    }
    
    // Close to n / O(nlogn)
    private static void counting(int[] arr)
    {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) 
        {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) 
        {
            while (count[i] > 0) 
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int[] arr) 
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}