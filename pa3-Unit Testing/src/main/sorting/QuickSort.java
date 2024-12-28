package sorting;

public class QuickSort {
    
    /**
     * Public method to sort an array using QuickSort algorithm.
     * @param array The array to be sorted.
     */
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Recursively applies QuickSort algorithm to sort the array between two indices.
     * @param array The array to be sorted.
     * @param begin The starting index of the array segment to be sorted.
     * @param end The ending index of the array segment to be sorted.
     */
    private static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            // Partitioning index
            int partitionIndex = partition(array, begin, end);

            // Sort the two partitions
            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    /**
     * Partitions the array into two parts and returns the partitioning index.
     * Elements less than the pivot are moved to the left of the pivot,
     * and those greater are moved to the right.
     * @param array The array to be partitioned.
     * @param begin The starting index for the partitioning.
     * @param end The ending index for the partitioning.
     * @return The partitioning index.
     */
    private static int partition(int[] array, int begin, int end) {
        // Choosing the rightmost element as the pivot
        int pivot = array[end];
        int i = (begin - 1); // Pointer for the greater element

        // Compare each element with pivot and swap if necessary
        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                // Swapping operation
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        // Swap the pivot element with the element at i+1 position
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1; // Return the pivot's final position
    }
}
