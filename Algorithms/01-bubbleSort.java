package Algorithms;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr);
        print(arr);
        
        int arr2[] = { 1, 2, 3, 4, 5 };
        bubble(arr2);
        print(arr2);
    }

    // O^n2
    private static void bubble(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int swap = 0;

            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                break; // Break the loop if no swaps were made, indicating the array is already sorted
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
