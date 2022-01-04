package com.esiee.bibliotheque.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

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

}