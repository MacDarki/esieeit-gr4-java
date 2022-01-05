package com.esiee.bibliotheque.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

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
    private TableView<Livre> TableView;

    @FXML
    private TableColumn<Livre, String> titre;

    @FXML
    private TableColumn<Livre, String> auteur;

    @FXML
    private TableColumn<Livre, String> presentation;

    @FXML
    private TableColumn<Livre, String> parution;

    @FXML
    private TableColumn<Livre, Integer> colonne;

    @FXML
    private TableColumn<Livre, Integer> rangee;

    ObservableList<Livre> list = FXCollections.observableArrayList(
            new Livre("Le Seigneur des anneaux", "Tolkien", "zeg", "2000", 1, 1),
            new Livre("Le Silence des agneaux", "Hannibal", "reth", "1980", 1, 2),
            new Livre("Retour vers le futur", "Marty", "poj", "2000", 1, 3)
    );


    public void initialize (URL url, ResourceBundle rb){
        titre.setCellValueFactory(new PropertyValueFactory<Livre,String>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<Livre,String>("auteur"));
        presentation.setCellValueFactory(new PropertyValueFactory<Livre,String>("presentation"));
        parution.setCellValueFactory(new PropertyValueFactory<Livre,String>("parution"));
        colonne.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("rangee"));

        TableView.setItems(list);

    }


}