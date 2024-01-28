public class reverseArray {
    public static void main(String[] args) {
        int arrays[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
    public static void reverse(int numbers[]) {
        int temp = 0;
        int first = 0, last = numbers.length - 1;

        // when first pointer will be smaller than last pointer that means no need to swap
        while (first < last) {
            // swap
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            // change first and last number
            first++;
            last--;
        }
    }
}
