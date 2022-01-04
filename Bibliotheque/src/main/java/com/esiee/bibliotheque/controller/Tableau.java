package com.esiee.bibliotheque.controller;

import com.esiee.bibliotheque.controller.Tableau_old;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tableau extends Application {

    @Override
    public void start(Stage stage) {

        TableView<Tableau_old> table = new TableView<Tableau_old>();

        // Create column UserName (Data type of String).
        TableColumn<Tableau_old, String> titre //
                = new TableColumn<Tableau_old, String>("Titre");

        // Create column Email (Data type of String).
        TableColumn<Tableau_old, String> auteur//
                = new TableColumn<Tableau_old, String>("Auteur");

        // Create column FullName (Data type of String).
        TableColumn<Tableau_old, String> presentation//
                = new TableColumn<Tableau_old, String>("Présentation");

        // Create 2 sub column for FullName.
        TableColumn<Tableau_old, String> parution//
                = new TableColumn<Tableau_old, String>("Parution");

        TableColumn<Tableau_old, Integer> colonne //
                = new TableColumn<Tableau_old, Integer>("Colonne");

        TableColumn<Tableau_old, Integer> rangee //
                = new TableColumn<Tableau_old, Integer>("Rangée");

        // Active Column
        TableColumn<Tableau_old, Boolean> activeCol//
                = new TableColumn<Tableau_old, Boolean>("Active");

        // Defines how to fill data for each cell.
        // Get value from property of UserAccount. .
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<>("auteur"));
        presentation.setCellValueFactory(new PropertyValueFactory<>("presentation"));
        parution.setCellValueFactory(new PropertyValueFactory<>("parution"));
        colonne.setCellValueFactory(new PropertyValueFactory<>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<>("rangee"));

        // Set Sort type for userName column
        titre.setSortType(TableColumn.SortType.DESCENDING);
        colonne.setSortable(false);

        // Display row data
        ObservableList<Tableau_old> list = getUserList();
        table.setItems(list);

        table.getColumns().addAll(titre, auteur, presentation, parution, colonne, rangee);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("TableView - Tableau de données");

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<Tableau_old> getUserList() {

        Tableau_old user1 = new Tableau_old("Le Seigneur des anneaux", "Tolkien", "zeg", "2000", 1, 1);
        Tableau_old user2 = new Tableau_old("Le Silence des agneaux", "Hannibal", "reth", "1980", 1, 2);
        Tableau_old user3 = new Tableau_old("Retour vers le futur", "Marty", "poj", "2000", 1, 3);

        ObservableList<Tableau_old> list = FXCollections.observableArrayList(user1, user2, user3);
        return list;
    }

    public static void main(String[] args) {
        launch(args);
    }
}