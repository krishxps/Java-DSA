package Algorithms;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void bubble(int[] arr, int length) {
        int size = length;
        for (int idx = 1; idx < length; idx++) {
            for (int index = 1; index < size; index++) {
                if (arr[index - 1] > arr[index]) {
                    int temp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = temp;
                }
            }
            size--;
        }
    }
}
