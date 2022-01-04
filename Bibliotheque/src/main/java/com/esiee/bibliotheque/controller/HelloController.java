package com.esiee.bibliotheque.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField AuteurField;

    @FXML
    private TextField ColonneField;

    @FXML
    private MenuItem MenuAboutInfos;

    @FXML
    private MenuItem MenuEditionSauvegarder;

    @FXML
    private MenuItem MenuEditionSauvegarderSous;

    @FXML
    private MenuItem MenuFichierOuvrir;

    @FXML
    private MenuItem MenuFichierQuitter;

    @FXML
    private TextField ParutionField;

    @FXML
    private TextField PresentationField;

    @FXML
    private TextField RangeeField;

    @FXML
    private TextField TitreField;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnValider;

    @FXML
    public void valider(){
        TitreField.setText("ça fonctionne");
    }

    ///////////////////// Menu /////////////////////
    @FXML
    void fichierouvrir(ActionEvent event) {

    }

    @FXML
    void fichierquitter(ActionEvent event) {

    }

    @FXML
    void editionsauvegarder(ActionEvent event) {

    }

    @FXML
    void editionsauvegardersous(ActionEvent event) {

    }

    @FXML
    void aboutinfos(ActionEvent event) {

    }

}