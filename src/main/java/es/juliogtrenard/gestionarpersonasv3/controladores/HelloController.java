package es.juliogtrenard.gestionarpersonasv3.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * Controlador para la interfaz gráfica de la gestión de personas.
 * Esta clase maneja la lógica para agregar personas a una lista,
 * validando la entrada del usuario y actualizando la vista.
 */
public class HelloController {

    /**
     * Maneja el evento de agregar una nueva persona a la lista.
     * Abre una ventana modal con el formulario para ingresar los datos de la nueva persona.
     *
     * @param event El evento que activa este método.
     */
    @FXML
    public void agregarPersona(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/es/juliogtrenard/gestionarpersonasv3/modal.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Nueva Persona");

        stage.setMinWidth(500);
        stage.setMinHeight(200);
        stage.setMaxWidth(500);
        stage.setMaxHeight(200);

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(
                ((Node)event.getSource()).getScene().getWindow() );
        stage.show();
    }
}