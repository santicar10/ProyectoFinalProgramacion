module com.example.proyectofinalprogramacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectofinalprogramacion to javafx.fxml;
    exports com.example.proyectofinalprogramacion;
    exports com.example.proyectofinalprogramacion.contollers;
    opens com.example.proyectofinalprogramacion.contollers to javafx.fxml;
}