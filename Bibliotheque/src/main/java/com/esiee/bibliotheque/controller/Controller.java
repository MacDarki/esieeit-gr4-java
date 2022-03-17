package com.esiee.bibliotheque.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller implements Initializable {
    @FXML private TextField TitreField;
    @FXML private TextField AuteurField;
    @FXML private TextField PresentationField;
    @FXML private TextField ParutionField;
    @FXML private TextField ColonneField;
    @FXML private TextField RangeeField;
 //   @FXML private TableView TableView;
    @FXML private Button btnEdit;
    // Bouton Valider
    @FXML private Button btnValider;
    private boolean okClicked = false;
    public boolean isOkClicked(){
        return okClicked;
    }
     private boolean isInputValid() {
        String errorMessage = "";

        if (TitreField.getText() == null || TitreField.getText().length() == 0) {
            errorMessage += "No valid titre!\n";
        }
        if (AuteurField.getText() == null || AuteurField.getText().length() == 0) {
            errorMessage += "No valid auteur!\n";
        }
        if (PresentationField.getText() == null || PresentationField.getText().length() == 0) {
            errorMessage += "No valid presentation!\n";
        }
        if (ParutionField.getText() == null || ParutionField.getText().length() == 0) {
            errorMessage += "No valid parution!\n";
        }
        if (ColonneField.getText() == null || ColonneField.getText().length() == 0) {
            errorMessage += "No valid colonne!\n";
        }
         try {
             Integer.parseInt(ColonneField.getText());
         }
         catch (Exception e){
             errorMessage += "No valid colonne!\n";
         }

        if (RangeeField.getText() == null || RangeeField.getText().length() == 0) {
            errorMessage += "No valid rangee!\n";
        }
        if (errorMessage.length() == 0) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();
        }
            return false;
    }

    @FXML private Button btnSuppr;
    @FXML private MenuItem MenuAboutInfos;
    @FXML private MenuItem MenuEditionSauvegarder;
    @FXML private MenuItem MenuEditionSauvegarderSous;
    @FXML private MenuItem MenuFichierOuvrir;
    @FXML private javafx.scene.control.MenuItem closeButton;
	private JAXBContext context;
	private JAXBContext jaxbContext;

    @FXML
    void aboutinfos(ActionEvent event) throws IOException {
    }

    @FXML
    void closeButtonAction() {
        System.exit(0);
    }

    @FXML
    void editionsauvegarder(ActionEvent event) throws JAXBException {
    	initJAXB();
    	
    	Marshaller marshaller = ((JAXBContext) this.context).createMarshaller();
    	marshaller.marshal(new Livre(null, null, null, null, 0, 0), new File("livres.xml"));
    	}

    @FXML
    void editionsauvegardersous(ActionEvent event) {
    }

    @FXML
    void fichierouvrir(ActionEvent event) throws IOException, JAXBException {
		JFileChooser chooser = new JFileChooser();
    	FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter(
    	     "xml files (*.xml)", "xml");

    	chooser.setDialogTitle("Open schedule file");
    	// set selected filter
    	chooser.setFileFilter(xmlfilter);
    	int value = chooser.showOpenDialog(null);
    	
    	if(value == JFileChooser.APPROVE_OPTION) {
    		File target = chooser.getSelectedFile();
    	    try
    	    {
    	      jaxbContext = JAXBContext.newInstance(Livre.class);
    	      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
    	       
    	      Livre livre = (Livre) jaxbUnmarshaller.unmarshal(target);
    	       
    	      System.out.println(livre);
    	    }
    	    catch (JAXBException e) 
    	    {
    	      e.printStackTrace();
    	    }
    	}
    }

    public void initJAXB() throws JAXBException {
		this.context = JAXBContext.newInstance(Livre.class);
    }


    ////////////// tableau ///////////////////
    @FXML  private TableView<Livre> TableView;
    @FXML  private TableColumn<Livre, String> titre;
    @FXML  private TableColumn<Livre, String> auteur;
    @FXML  private TableColumn<Livre, String> presentation;
    @FXML  private TableColumn<Livre, String> parution;
    @FXML  private TableColumn<Livre, Integer> colonne;
    @FXML  private TableColumn<Livre, Integer> rangee;

    ObservableList<Livre> list = FXCollections.observableArrayList(
            new Livre("Le Seigneur des anneaux", "Tolkien", "zeg", "2000", 1, 1),
            new Livre("Le Silence des agneaux", "Hannibal", "reth", "1980", 1, 2),
            new Livre("Retour vers le futur", "Marty", "poj", "2000", 1, 3)
    );


    public void initialize (URL url, ResourceBundle rb){
        // Initialiser les colonnes
        titre.setCellValueFactory(new PropertyValueFactory<Livre,String>("titre"));
        auteur.setCellValueFactory(new PropertyValueFactory<Livre,String>("auteur"));
        presentation.setCellValueFactory(new PropertyValueFactory<Livre,String>("presentation"));
        parution.setCellValueFactory(new PropertyValueFactory<Livre,String>("parution"));
        colonne.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("colonne"));
        rangee.setCellValueFactory(new PropertyValueFactory<Livre,Integer>("rangee"));

        TableView.setItems(list);

        // Clear person details.
        //showLivreDetails(null);

        // Listener
        TableView.getSelectionModel().selectedItemProperty().addListener(
                ((observable, oldValue,newValue) -> showLivreDetails(newValue))
        );

        btnValider.setOnMouseClicked(btnAction -> {
            if (isInputValid()){
                Livre monLivre = new Livre(TitreField.getText(), AuteurField.getText(), PresentationField.getText(), ParutionField.getText(), Integer.parseInt(ColonneField.getText()), Integer.parseInt(RangeeField.getText()));

                TableView.getItems().add(monLivre);

            }
        });

    }


    private void showLivreDetails(Livre livre){
        if (livre != null) {
            // Fill the labels with info from the person object.
            titre.setText(livre.getTitre());
            auteur.setText(livre.getAuteur());
            presentation.setText(livre.getPresentation());
            parution.setText(livre.getParution());
            colonne.setText(String.valueOf(livre.getColonne()));
            rangee.setText(String.valueOf(livre.getRangee()));
        }
        else {
            // Livre is null, remove all the text.
            titre.setText("");
            auteur.setText("");
            presentation.setText("");
            parution.setText("");
            colonne.setText("");
            rangee.setText("");
        }
    }

    // Bouton Suppression
    @FXML
    void handleDeleteLivre(ActionEvent event) {
        int selectedIndex = TableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            TableView.getItems().remove(selectedIndex);
        } else {
            // Nothing selected
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Aucune sélection");
            alert.setHeaderText("Aucun livre sélectionné");
            alert.setContentText("Merci de choisir un livre dans le tableau.");

            alert.showAndWait();
        }
    }
    
    @FXML
    void handleModifLivre(ActionEvent event) {
        Livre selectedLivre = TableView.getSelectionModel().getSelectedItem();
        int selectedIndex = TableView.getSelectionModel().getSelectedIndex();
        if (selectedLivre != null) {
            TableView.getItems().remove(selectedIndex);
            TitreField.setText(selectedLivre.titre);
            AuteurField.setText(selectedLivre.auteur);
            PresentationField.setText(selectedLivre.presentation);
            ParutionField.setText(selectedLivre.parution);
            int colonne = selectedLivre.colonne;
            ColonneField.setText(String.valueOf(colonne));
            int rangee = selectedLivre.rangee;
            RangeeField.setText(String.valueOf(rangee));
        }
    }

}