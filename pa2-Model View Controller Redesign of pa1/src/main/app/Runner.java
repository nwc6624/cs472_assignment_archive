package main.app;

import mvc.Model;
import mvc.View;
import mvc.Controller;

public class Runner {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.initController();
    }
}
