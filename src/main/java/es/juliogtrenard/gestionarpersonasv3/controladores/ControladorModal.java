package es.juliogtrenard.gestionarpersonasv3.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

/**
 * Controlador para la ventana modal que se abre al agregar una nueva persona.
 */
public class ControladorModal {
    /**
     * Maneja el evento de cerrar la ventana modal.
     *
     * @param event El evento que activa este método.
     */
    @FXML
    public void cerrarVentana(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
}