package com.example.exampleproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void button() {
        welcomeText.setText("Привет друг");
    }
}