module com.example.registro_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registro_app to javafx.fxml;
    exports com.example.registro_app;
}