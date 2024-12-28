package sorting;

import sorting.QuickSort;
import sorting.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array
        int[] array = {5, 3, 7, 2, 8, 4, 1, 6};
        // Display original array
        System.out.println("Original Array: " + Arrays.toString(array));
        // Sort the array using QuickSort's static method
        QuickSort.sort(array); // No need for instantiation or passing start/end indices
        // Display sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
        // Input target value for binary search
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();
        // Assuming BinarySearch.binarySearch is correctly set up for instance call
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(array, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
