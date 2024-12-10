import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        // Define the integer array
        int[] array = {1, 5, 8, 6, 6, 2, 9, 9, 3, 8, 6, 47};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Call the method to reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // Method to reverse the given array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap the elements from both ends until the middle is reached
        while (start < end) {
            int temp = array[start];   // Store the starting element
            array[start] = array[end]; // Replace start with end
            array[end] = temp;         // Replace end with the stored starting element
            start++;                   // Move start index forward
            end--;                     // Move end index backward
        }
    }
}
