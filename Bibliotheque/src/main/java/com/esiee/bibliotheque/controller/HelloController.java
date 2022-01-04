package com.esiee.bibliotheque.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML private TextField AuteurField;
    @FXML private TextField ColonneField;
    @FXML private MenuItem MenuAboutInfos;
    @FXML private MenuItem MenuEditionSauvegarder;
    @FXML private MenuItem MenuEditionSauvegarderSous;
    @FXML private MenuItem MenuFichierOuvrir;
    @FXML private MenuItem MenuFichierQuitter;
    @FXML private javafx.scene.control.MenuItem closeButton;
    @FXML private TextField ParutionField;
    @FXML private TextField PresentationField;
    @FXML private TextField RangeeField;
    @FXML private TextField TitreField;
    @FXML private Button btnEdit;
    @FXML private Button btnValider;


    @FXML
    void aboutinfos(ActionEvent event) throws IOException {

    }

    @FXML
    void closeButtonAction() {
        System.exit(0);
    }

    @FXML
    void editionsauvegarder(ActionEvent event) {

    }

    @FXML
    void editionsauvegardersous(ActionEvent event) {

    }

    @FXML
    void fichierouvrir(ActionEvent event) throws IOException {
        Process p = new ProcessBuilder("Explorer.exe", "/select,C:\\directory\\selectedFile").start();
    }

    @FXML
    void valider(ActionEvent event) {
    }

    ////////////// tableau ///////////////////
    @FXML
    private TableView<Tableau> table;

    @FXML
    private TableColumn<Tableau, String> titre;

    @FXML
    private TableColumn<Tableau, String> auteur;

    @FXML
    private TableColumn<Tableau, String> presentation;

    @FXML
    private TableColumn<Tableau, String> parution;

    @FXML
    private TableColumn<Tableau, Integer> colonne;

    @FXML
    private TableColumn<Tableau, Integer> rangee;

    ObservableList<Tableau> list = FXCollections.observableArrayList(
            new Tableau(1,1,"Le Seigneur des Anneaux", "Tolkien", "oikjzer", "2000"),
            new Tableau(1,2,"Le Silence des Agneaux", "Lecter", "oikjzer", "2010"),
            new Tableau(1,3,"Spider-Man Far from home", "Araignée", "oikjzer", "2020"),
            new Tableau(1,4,"Retour vers le Futur", "Marty", "oikjzer", "1985")
    );

    public void initialize (URL url, ResourceBundle rb){
        titre.setCellValueFactory(new PropertyValueFactory<Tableau,String>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<Tableau,String>("auteur"));
        presentation.setCellValueFactory(new PropertyValueFactory<Tableau,String>("presentation"));
        parution.setCellValueFactory(new PropertyValueFactory<Tableau,String>("parution"));
        colonne.setCellValueFactory(new PropertyValueFactory<Tableau,Integer>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<Tableau,Integer>("rangee"));

        table.setItems(list);

    }
}