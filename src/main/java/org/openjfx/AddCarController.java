package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddCarController {
    @FXML private TextField carBrand;
    @FXML private TextField carModel;
    @FXML private TextField volume;

    @FXML
    private void addCar() throws IOException {
        Car car = new Car(carBrand.getText(), carModel.getText(), Integer.parseInt(volume.getText()));

        System.out.println(car);
    }
}