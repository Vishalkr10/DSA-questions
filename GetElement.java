//Find the number that appears once, and the other numbers twice--
//two approach..one is linear search and optimise approach is using xor operation
public class GetElement {
    public static int getSingleElement(int[] arr) {
        int xor = 0; // Step 1: Initialize xor with 0

        // Step 2: XOR all elements
        for (int num : arr) {
            xor = xor ^ num; // XOR operation
        }

        return xor; // Step 3: Return the unique element
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}

