module com.example.parcialahora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.parcialahora to javafx.fxml;
    exports com.example.parcialahora;
}