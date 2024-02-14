package Algorithms;

public class 03-insertionSort {
    public static void main(String[] args) 
    {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertion(arr);
        print(arr);
    }

    // O(n2)
    public static void insertion(int[] arr) 
    {
        int length = arr.length;

        for (int i = 1; i < length; i++) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
