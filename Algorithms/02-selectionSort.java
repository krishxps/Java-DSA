package Algorithms;

public class selectionSort {
    public static void main(String[] args) 
    {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection(arr);
        print(arr);
    }

    // O(n2)
    public static void selection(int[] arr) 
    {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // Swap arr[i] with the minimum element found
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
