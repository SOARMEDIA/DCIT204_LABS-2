import java.util.Scanner;

/**
 * PairSum.java
 *
 * Interactive program that reads an array of integers and a target sum
 * from the user, then searches for a pair of values whose sum equals
 * the target, using the Brute Force (Nested Loop) algorithm.
 *
 * Algorithm: Brute Force Nested Loop
 * Time Complexity: O(n^2) — every pair (i, j) with i < j is checked.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        while (n <= 1) {
            System.out.print("Array size must be greater than 1 (need at least 2 elements). Please enter again: ");
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

        // Step 4: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 5: Brute force nested loop search for a pair
        boolean found = false;

        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n----- RESULT -----");
                    System.out.println("Pair found!");
                    System.out.println("Index " + i + " -> Value: " + numbers[i]);
                    System.out.println("Index " + j + " -> Value: " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    System.out.println("-------------------");
                    found = true;
                    break outerLoop; // stop after first matching pair found
                }
            }
        }

        // Step 6: If no pair was found, inform the user
        if (!found) {
            System.out.println("\nNo pair of numbers in the array sums up to " + target + ".");
        }

        scanner.close();
    }
}
