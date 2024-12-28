package mvc;

import java.util.Arrays;

public class View {
    public void displayArray(String message, int[] array) {
        System.out.println(message + Arrays.toString(array));
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
