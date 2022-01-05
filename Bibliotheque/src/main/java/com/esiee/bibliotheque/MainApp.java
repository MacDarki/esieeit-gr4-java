package com.esiee.bibliotheque;

import com.esiee.bibliotheque.controller.Livre;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
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

    private final ObservableList<Livre> list = FXCollections.observableArrayList();

    public ObservableList<Livre> getList(){
        list.add(new Livre("Le Seigneur des anneaux", "Tolkien", "zeg", "2000", 1, 1));
        list.add(new Livre("Le Silence des agneaux", "Hannibal", "reth", "1980", 1, 2));
        list.add(new Livre("Retour vers le futur", "Marty", "poj", "2000", 1, 3));
        return list;
    }

    public static void main(String[] args) {
        launch();
    }
}