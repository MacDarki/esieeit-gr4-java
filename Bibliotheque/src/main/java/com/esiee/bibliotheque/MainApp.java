package com.esiee.bibliotheque;


import com.esiee.bibliotheque.controller.Livre;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class MainApp extends Application {
    @Override

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("appli.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bibliothèque - M1 M2I ESIEE IT");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    ///////////////// Sauvegarde /////////////////////////

}
