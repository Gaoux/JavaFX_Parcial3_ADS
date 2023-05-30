package com.example.parcialahora;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.parcialahora.Nomina.calcularSalario;

public class ControllerOpcion4 {
    @FXML
    private TextField nombreEmpleado;
    @FXML
    private Label cantidad;
    @FXML
    private Label salario;
    @FXML
    private Button salir;

    private Nomina nomina;
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomina = ControllerMenu.nomina;
    }
    @FXML
    public void empleaditos(){
        String nombre = nombreEmpleado.getText().trim();
        for(Persona empleado: ControllerMenu.nomina.getPersonas()){
            if(empleado instanceof Empleado){
                if(empleado.getNombre().equals(nombre)){
                    cantidad.setText(String.valueOf(empleado.getNumeroSalarioMinimo()));
                    salario.setText(String.valueOf(calcularSalario(empleado)));
                }
            }
        }
    }
    @FXML
    public void llamarMenu(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 2");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(salir.getScene().getWindow());
            stage.show();
            Stage st = (Stage) salir.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }
}