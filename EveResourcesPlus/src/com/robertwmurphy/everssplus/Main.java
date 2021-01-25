package com.robertwmurphy.everssplus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Eve Resources+");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.println("test");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
