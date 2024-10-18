module es.juliogtrenard.gestionarpersonasv3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.gestionarpersonasv3 to javafx.fxml;
    exports es.juliogtrenard.gestionarpersonasv3;
    exports es.juliogtrenard.gestionarpersonasv3.controladores;
    exports es.juliogtrenard.gestionarpersonasv3.modelos;
    opens es.juliogtrenard.gestionarpersonasv3.controladores to javafx.fxml;
    opens es.juliogtrenard.gestionarpersonasv3.modelos to javafx.fxml;
}