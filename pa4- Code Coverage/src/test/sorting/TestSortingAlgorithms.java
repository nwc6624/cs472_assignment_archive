/*Assignment: PA 04- Code Coverage  
 * Author: Noah Caulfield
 * Date: 4/13/2024
 * Class CS 472- Software Engineering
 */
package sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestSortingAlgorithms {
    @Test
    public void testQuickSort() {
        int[] actual = {5, 3, 8, 6, 2};
        int[] expected = {2, 3, 5, 6, 8};
        QuickSort.sort(actual);
        assertArrayEquals("QuickSort should sort the array", expected, actual);
    }

    @Test
    public void testBinarySearch() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        BinarySearch search = new BinarySearch();
        assertEquals("BinarySearch should find the element at index 2", 2, search.binarySearch(sortedArray, 3));
        assertEquals("BinarySearch should return -1 for a non-existent element", -1, search.binarySearch(sortedArray, 10));
    }
}
