/*Assignment: PA 03- JUnit Testing for QuickSort and BinarySearch   
 * Author: Noah Caulfield
 * Date: 4/4/2024
 * Class CS 472- Software Engineering
 */

package sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestSortingAlgorithms {

    @Test
    public void testQuickSort() {
        // Changed the test array to include a wider range of numbers and a different order
        int[] array = {9, 4, 7, 1, 3, 8, 5};
        QuickSort.sort(array);
        assertArrayEquals("Array should be sorted", new int[]{1, 3, 4, 5, 7, 8, 9}, array);
    }

    @Test
    public void testBinarySearch() {
        // Using a different sorted array and searching for different target values
        int[] sortedArray = {2, 4, 6, 8, 10, 12};
        BinarySearch binarySearch = new BinarySearch(); // Creating an instance of BinarySearch
        
        // Test finding an element that exists
        assertEquals("Element 6 should be found at index 2", 2, binarySearch.binarySearch(sortedArray, 6));
        
        // Test looking for an element at the beginning of the array
        assertEquals("Element 2 should be found at index 0", 0, binarySearch.binarySearch(sortedArray, 2));
        
        // Test looking for an element at the end of the array
        assertEquals("Element 12 should be found at index 5", 5, binarySearch.binarySearch(sortedArray, 12));
      
        
        // Test looking for an element that does not exist
        assertEquals("Element 11 should not be found, expected result is -1", -1, binarySearch.binarySearch(sortedArray, 11));
    }
}
