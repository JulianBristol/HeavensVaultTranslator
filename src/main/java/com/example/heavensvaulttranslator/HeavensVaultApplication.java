package com.example.heavensvaulttranslator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HeavensVaultApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "src/main/resources/com/example/heavensvaulttranslator/Heaven's Vault Translator GUI.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        VBox root = (VBox) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        File f = new File("src/AncientGlyphsColumn.css");
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Heaven's Vault Translator - A Julian Bristol Project");
        // Display the Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}