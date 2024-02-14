package Algorithms;
import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.print("Normal Sort:                     ");
        Arrays.sort(arr);
        print(arr);
        
        // Reverse Order
        Integer arr2[] = { 5, 4, 1, 3, 2 };
        System.out.print("Normal Reverse Sort:             ");
        Arrays.sort(arr2, Collections.reverseOrder());
        print(arr2);

        // For Target Indexes
        int arr3[] = { 5, 4, 1, 3, 2 };
        System.out.print("Reverse Sort from 0idx to 2idx:  ");
        Arrays.sort(arr, 0 , 2);
        print(arr3);
    }

    public static void print(Integer arr[]) 
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
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
