import java.util.Scanner;

/**
 * FindMax.java
 *
 * Interactive program that reads an array of integers from the user
 * and finds the maximum value together with the index at which it occurs.
 *
 * Algorithm: Linear Search
 * Time Complexity: O(n) — every element is visited exactly once.
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Basic validation so the program doesn't crash on bad input
        while (n <= 0) {
            System.out.print("Array size must be greater than 0. Please enter again: ");
            n = scanner.nextInt();
        }

        // Step 2: Create the array
        int[] numbers = new int[n];

        // Step 3: Collect each element from the user
        System.out.println("Enter " + n + " integer value(s):");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Linear search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results
        System.out.println("\n----- RESULTS -----");
        System.out.println("Array entered : " + arrayToString(numbers));
        System.out.println("Maximum value : " + maxValue);
        System.out.println("Found at index: " + maxIndex);
        System.out.println("--------------------");

        scanner.close();
    }

    /**
     * Helper method to format an array nicely for display.
     */
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
