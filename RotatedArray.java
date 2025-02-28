import java.util.Arrays;

public class RotatedArray {
    // Function to reverse array from 'start' to 'end'
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;  // Agar k bada ho, toh modulo le lenge

        // Step 1: Reverse full array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse first 'k' elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse last 'n-k' elements
        reverse(arr, k, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};  
        int k = 2;
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
