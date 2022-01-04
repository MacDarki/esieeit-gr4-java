package com.esiee.bibliotheque.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<Tableau_old> table;

    @FXML
    private TableColumn<Tableau_old, String> titre;

    @FXML
    private TableColumn<Tableau_old, String> auteur;

    @FXML
    private TableColumn<Tableau_old, String> presentation;

    @FXML
    private TableColumn<Tableau_old, String> parution;

    @FXML
    private TableColumn<Tableau_old, Integer> colonne;

    @FXML
    private TableColumn<Tableau_old, Integer> rangee;


}