package view;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class Controller {
    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
