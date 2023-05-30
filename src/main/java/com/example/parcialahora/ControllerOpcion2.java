package com.example.parcialahora;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerOpcion2 {
    @FXML
    private TextField nombreAsignatura;
    @FXML
    private TextField nombreProfesores;
    @FXML
    private TextField numeroHoras;
    @FXML
    private Button salir;
    private Nomina nomina;
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nomina = ControllerMenu.nomina;
    }
    @FXML
    public void agregarAProfesor(){
        boolean existe=false;

        try{
            for (Persona empleado : ControllerMenu.nomina.getPersonas()){
                if (empleado instanceof Profesor)
                    if(empleado.getNombre().equals(nombreProfesores.getText().trim())){
                        ((Profesor) empleado).agregarAsignatura(Integer.parseInt(numeroHoras.getText().trim()), nombreAsignatura.getText().trim());
                        existe=true;
                    }
            }if(!existe){
                throw new Exception("El profesor ingresado no existe");
            }
        }catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.ERROR,e.getMessage().toString());
            a.show();
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
