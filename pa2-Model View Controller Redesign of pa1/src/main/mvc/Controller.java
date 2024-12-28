package mvc;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void initController() {
        Scanner scanner = new Scanner(System.in);
        model.setArray(new int[]{5, 3, 7, 2, 8, 4, 1, 6}); // Set the initial array

        view.displayArray("Original Array: ", model.getArray());

        model.sortArray();
        view.displayArray("Sorted Array: ", model.getArray());

        view.displayMessage("Enter a number to search for: ");
        int target = scanner.nextInt();

        int result = model.searchArray(target);
        if (result != -1) {
            view.displayMessage("Target found at index: " + result);
        } else {
            view.displayMessage("Target not found in the array.");
        }

        scanner.close();
    }
}
