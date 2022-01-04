module com.esiee.bibliotheque {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.esiee.bibliotheque to javafx.fxml;
    exports com.esiee.bibliotheque;
    exports com.esiee.bibliotheque.controller;
    opens com.esiee.bibliotheque.controller to javafx.fxml;
}