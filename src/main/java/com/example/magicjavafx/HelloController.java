package com.example.magicjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tfName;

    @FXML
    protected void onHelloButtonClick() {
        String txt = tfName.getText();
        welcomeText.setText("Вы ввели: " + txt);
    }
}