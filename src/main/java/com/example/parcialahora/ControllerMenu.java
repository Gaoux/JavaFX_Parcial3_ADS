package com.example.parcialahora;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMenu implements Initializable {
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button boton4;
    @FXML
    private Button boton5;
    @FXML
    private Button boton6;
    @FXML
    private Button boton7;

    public static final Nomina nomina = new Nomina();

    public void initialize(URL url, ResourceBundle resourceBundle) {
        String fileName = "src/main/resources/ejemplo.txt";
        FileHandler.leerArchivoNomina(nomina, fileName);
    }

    public void opcion2() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("opcion2.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 2");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton2.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton2.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }

    public void opcion3() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("opcion3.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 3");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton3.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton3.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }

    public void opcion4() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("opcion4.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 4");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton4.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton4.getScene().getWindow();
            st.setOpacity(0.0);
        } catch (Exception e) {
        }
    }
    public void opcion5 (){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("opcion5.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 5");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton5.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton5.getScene().getWindow();
            st.setOpacity(0.0);
        }catch(Exception e){}
    }
    public void opcion6 (){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("opcion6.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 6");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton6.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton6.getScene().getWindow();
            st.setOpacity(0.0);
        }catch(Exception e){}
    }
    public void opcion7 (){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("opcion7.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Opcion 7");
            stage.setScene(scene);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(boton7.getScene().getWindow());
            stage.show();
            Stage st = (Stage) boton7.getScene().getWindow();
            st.setOpacity(0.0);
        }catch(Exception e){}
    }
}
