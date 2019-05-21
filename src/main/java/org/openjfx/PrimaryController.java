package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToAddCar() throws IOException {
        App.setRoot("addCar");
    }
}
