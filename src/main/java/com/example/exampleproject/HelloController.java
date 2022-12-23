package com.example.exampleproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;


    public void showNewWindow(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("transition.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stageSecond = new Stage();
        stageSecond.setTitle("Hello!");
        stageSecond.setScene(scene);
        stageSecond.show();
    }
}
