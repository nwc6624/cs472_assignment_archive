package mvc;

import sorting.QuickSort;
import searching.BinarySearch;

public class Model {
    private int[] array;
    private final QuickSort quickSort = new QuickSort();
    private final BinarySearch binarySearch = new BinarySearch();

    public void setArray(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array.clone();
    }

    public void sortArray() {
        quickSort.quickSort(array, 0, array.length - 1);
    }

    public int searchArray(int target) {
        return binarySearch.binarySearch(array, target);
    }
}
